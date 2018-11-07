package ww.dao.impl;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import ww.dao.UserDao;
import ww.entity.User;
import ww.utils.DBUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getCon();
		String sql="INSERT INTO t_user VALUES(NULL,?,?)";
		int num=0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUser_name());
			ps.setString(2, user.getUser_pwd());
			num = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getCon();
		String sql="SELECT * FROM t_user WHERE `user_name`=? AND `user_pwd`=?";
		boolean flag=false;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUser_name());
			ps.setString(2, user.getUser_pwd());
			java.sql.ResultSet rs =  ps.executeQuery();
			if(rs.next()){
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
