package ww.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBUtil {
	public static Connection getCon(){
		Connection con=null;
		try {
			Class.forName(Constants.MYSQL_DRIVER);
			 con = DriverManager.getConnection(Constants.MYSQL_ADDRESS, Constants.MYSQL_USERNAME, Constants.MYSQL_PASSWARD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * πÿ±’¡¨Ω”
	 */
	public static void close(Connection con,PreparedStatement ps,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
				}
			if(ps!=null){
				ps.close();
			}
			if(con!=null){
				con.close();
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
