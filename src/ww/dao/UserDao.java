package ww.dao;

import ww.entity.User;


public interface UserDao {
	public int addUser(User user);
	/***
	 * ×¢²á
	 * @param user
	 * @return
	 */
	public boolean login(User user);
	/**
	 * µÇÂ¼
	 */
}
