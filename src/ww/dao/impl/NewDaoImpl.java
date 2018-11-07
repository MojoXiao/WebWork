package ww.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ww.dao.NewDao;
import ww.entity.News;
import ww.entity.User;
import ww.utils.DBUtil;

public class NewDaoImpl implements NewDao{

	@Override
	public List<News> findAll() {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getCon();
		String sql="SELECT * FROM xinwen";
		//存储user对象的集合
		List<News> list=new ArrayList<News>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//数据库表中数据获取
				String title=rs.getString("titel");
				String time=rs.getString("time");
				String comeform=rs.getString("comeform");
				String neirong=rs.getString("neirong");
				//将表信息封装到对象里面
				News news= new News(title,time,comeform,neirong);
				//将对象放入集合
				list.add(news);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public News findBytutle(String title) {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getCon();
		String sql="SELECT * FROM xinwen WHERE title=?";
		News news=null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				news=new News(rs.getString("title"),
				 rs.getString("time"),
				 rs.getString("comeform"),
				 rs.getString("neirong"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return news;
	}

	}


