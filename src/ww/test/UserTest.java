package ww.test;

import org.junit.Test;

import ww.dao.UserDao;
import ww.dao.impl.UserDaoImpl;
import ww.entity.User;


public class UserTest {
	@Test
	public void login(){
		//ʵ����dao����
		UserDao dao=new UserDaoImpl();
		User user=new User("admin", "123");
		//����dao����ķ�����֤��½�Ƿ�ɹ�
		boolean flag=dao.login(user);
		if (flag) {
			System.out.println("��½�ɹ�");
		}
		
	}
	
}
