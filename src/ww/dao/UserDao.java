package ww.dao;

import ww.entity.User;


public interface UserDao {
	public int addUser(User user);
	/***
	 * ע��
	 * @param user
	 * @return
	 */
	public boolean login(User user);
	/**
	 * ��¼
	 */
}
