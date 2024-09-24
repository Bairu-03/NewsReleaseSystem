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
}
