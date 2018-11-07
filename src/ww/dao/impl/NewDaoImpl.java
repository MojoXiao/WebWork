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
		//�洢user����ļ���
		List<News> list=new ArrayList<News>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//���ݿ�������ݻ�ȡ
				String title=rs.getString("titel");
				String time=rs.getString("time");
				String comeform=rs.getString("comeform");
				String neirong=rs.getString("neirong");
				//������Ϣ��װ����������
				News news= new News(title,time,comeform,neirong);
				//��������뼯��
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


