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
            dbUtils.closeStmt(pstmt);
            dbUtils.closeConn(conn);
        }
        return newsList;
    }
}
