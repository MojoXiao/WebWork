package ww.dao;

import java.util.List;

import ww.entity.News;
import ww.entity.User;
public interface NewDao {
	public List<News> findAll();
	public News findBytutle(String title);
	
}
