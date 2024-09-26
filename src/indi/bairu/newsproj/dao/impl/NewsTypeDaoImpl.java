package indi.bairu.newsproj.dao.impl;

import indi.bairu.newsproj.dao.NewsTypeDao;
import indi.bairu.newsproj.domain.NewsType;
import indi.bairu.newsproj.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 新闻类型数据访问层的实现类
 */
public class NewsTypeDaoImpl implements NewsTypeDao {
    /**
     * 获得所有的新闻类型的信息
     * @return 所有的新闻类型信息
     */
    @Override
    public List<NewsType> findAll() {
        List<NewsType> newsTypeList = new ArrayList<>();
        // 获得数据库工具类对象
        DBUtils dbutils = DBUtils.getInstance();
        // 声明数据库工具类对象
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 获得连接对象
            conn = dbutils.getConn();
            // 定义sql语句
            String sql = "select * from newstype";
            // 获得命令对象
            pstmt = conn.prepareStatement(sql);
            // 获得结果集对象
            rs = pstmt.executeQuery();

            // 处理结果
            while (rs.next()) {
                NewsType nt = new NewsType();
                nt.setTypeid(rs.getInt("typeid"));
                nt.setTypename(rs.getString("typename"));
                // 保存到集合中
                newsTypeList.add(nt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 资源释放
            dbutils.closeRs(rs);
            dbutils.closePstmt(pstmt);
            dbutils.closeConn(conn);
        }
        return newsTypeList;
    }

    /**
     * 根据新闻类型名获得指定对象
     * @param typename 新闻类型名
     * @return 新闻类型对象
     */
    @Override
    public NewsType findByName(String typename) {
        NewsType nt = null;
        DBUtils dbutils = DBUtils.getInstance();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = dbutils.getConn();
            String sql = "select * from newstype where typename = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, typename);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                nt = new NewsType();
                nt.setTypeid(rs.getInt("typeid"));
                nt.setTypename(rs.getString("typename"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbutils.closeRs(rs);
            dbutils.closePstmt(pstmt);
            dbutils.closeConn(conn);
        }
        return nt;
    }

    /**
     * 添加新闻类型
     * @param nt 新闻类型对象
     * @return 数据库中受影响的行数
     */
    @Override
    public int save(NewsType nt) {
        int nResult = 0;
        DBUtils dbutils = DBUtils.getInstance();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = dbutils.getConn();
            String sql = "insert into newstype(typename) values(?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nt.getTypename());
            nResult = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbutils.closePstmt(pstmt);
            dbutils.closeConn(conn);
        }
        return nResult;
    }

    @Override
    public NewsType findById(int typeid) {
        //声明新闻类型对象
        NewsType nt = null;
        //获得数据库工具类的对象
        DBUtils dbutils = DBUtils.getInstance();
        //声明数据的相关对象
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = dbutils.getConn();
            String sql = "select * from newstype where typeid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, typeid);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                nt = new NewsType();
                nt.setTypeid(rs.getInt("typeid"));
                nt.setTypename(rs.getString("typename"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbutils.closeRs(rs);
            dbutils.closePstmt(pstmt);
            dbutils.closeConn(conn);
        }
        return nt;
    }

    @Override
    public int update(NewsType nt) {
        int nResult = 0;
        DBUtils dbutils = DBUtils.getInstance();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = dbutils.getConn();
            String sql = "update newstype set typename = ? where typeid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nt.getTypename());
            pstmt.setInt(2, nt.getTypeid());
            nResult = pstmt.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            dbutils.closePstmt(pstmt);
            dbutils.closeConn(conn);
        }
        return nResult;
    }

    @Override
    public int delete(int typeid) {
        int nResult = 0;
        DBUtils dbutils = DBUtils.getInstance();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = dbutils.getConn();
            String sql = "delete from newstype where typeid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, typeid);
            nResult = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbutils.closePstmt(pstmt);
            dbutils.closeConn(conn);
        }
        return nResult;
    }
}
