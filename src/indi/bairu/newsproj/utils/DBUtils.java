package indi.bairu.newsproj.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*数据库相关对象操作类*/
public class DBUtils {
	private DBUtils() {}
	private static DBUtils dbutils;

	static {
		if (dbutils == null) {
			dbutils = new DBUtils();
		}
	}

	// 获取DBUtils的实例
	public static DBUtils getInstance() {
		return dbutils;
	}

	// 获取数据库连接对象
	public Connection getConn() {
		Connection conn = null;
		try {
			// 加载数据库驱动类
			Class.forName(DBConfig.DRIVERCLASS);
			conn = DriverManager.getConnection(DBConfig.URL,DBConfig.USERNAME,DBConfig.PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("加载数据库驱动类异常！");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("获取数据库连接对象异常！");
			e.printStackTrace();
		}
		return conn;
	}

	// 关闭数据库连接对象
	public void closeConn(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭数据库连接对象异常！");
			e.printStackTrace();
		}
	}

	// 关闭数据库执行对象
	public void closeStmt(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭数据库执行对象异常！");
			e.printStackTrace();
		}
	}

	// 关闭数据库预处理执行对象
	public void closePstmt(PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭数据库预处理执行对象异常！");
			e.printStackTrace();
		}
	}

	// 关闭数据库结果集对象
	public void closeRs(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println("关闭数据库结果集对象异常！");
			e.printStackTrace();
		}
	}

	// 数据库连接测试
    public static void main(String[] args) {
        Connection conn = dbutils.getConn();
        if (conn != null) {
            System.out.println("数据库连接成功：" + conn);
        } else {
            System.out.println("数据库连接失败");
        }
        dbutils.closeConn(conn);
    }
}
