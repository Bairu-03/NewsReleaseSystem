package indi.bairu.newsproj.dao.impl;

import indi.bairu.newsproj.dao.NewsDao;
import indi.bairu.newsproj.domain.News;
import indi.bairu.newsproj.utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 新闻数据访问层接口实现类
 */
public class NewsDaoImpl implements NewsDao {
    /**
     * 查询指定的新闻类型下包含的新闻信息
     * @param typeid 新闻类型编号
     * @return 指定的新闻类型下包含的新闻信息
     */
    @Override
    public List<News> findByTypeid(int typeid) {
        List<News> newsList = new ArrayList<>();
        DBUtils dbUtils = DBUtils.getInstance();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = dbUtils.getConn();
            String sql = "select * from news where typeid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, typeid);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                News ns = new News();
                ns.setNewsid(rs.getInt("newsid"));
                ns.setTitle(rs.getString("title"));
                ns.setNewscontent(rs.getString("newscontent"));
                ns.setTypeid(rs.getInt("typeid"));
                ns.setCreatedate(rs.getString("createdate"));
                newsList.add(ns);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeRs(rs);
            dbUtils.closePstmt(pstmt);
            dbUtils.closeConn(conn);
        }
        return newsList;
    }

    /**
     * 查询所有新闻
     *
     * @return 所有新闻
     */
    @Override
    public List<News> findAll() {
        List<News> newsList = new ArrayList<>();
        DBUtils dbUtils = DBUtils.getInstance();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = dbUtils.getConn();
            String sql = "select * from news";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                News ns = new News();
                ns.setNewsid(rs.getInt("newsid"));
                ns.setTitle(rs.getString("title"));
                ns.setNewscontent(rs.getString("newscontent"));
                ns.setTypeid(rs.getInt("typeid"));
                ns.setCreatedate(rs.getString("createdate"));
                newsList.add(ns);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeRs(rs);
            dbUtils.closePstmt(pstmt);
            dbUtils.closeConn(conn);
        }
        return newsList;
    }

    /**
     * 根据新闻编号获得指定新闻详情
     *
     * @param newsid 新闻编号
     * @return 新闻信息
     */
    @Override
    public News findById(int newsid) {
        News news = new News();
        DBUtils dbUtils = DBUtils.getInstance();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = dbUtils.getConn();
            String sql = "select news.*,typename from news,newstype where news.typeid=newstype.typeid and newsid=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newsid);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                news = new News();
                news.setNewsid(rs.getInt("newsid"));
                news.setTitle(rs.getString("title"));
                news.setNewscontent(rs.getString("newscontent"));
                news.setTypeid(rs.getInt("typeid"));
                news.setTypename(rs.getString("typename"));
                news.setCreatedate(rs.getString("createdate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeRs(rs);
            dbUtils.closePstmt(pstmt);
            dbUtils.closeConn(conn);
        }
        return news;
    }
}
