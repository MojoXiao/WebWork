package ww.test;

import org.junit.Test;

import ww.dao.UserDao;
import ww.dao.impl.UserDaoImpl;
import ww.entity.User;


public class UserTest {
	@Test
	public void login(){
		//实例化dao对象
		UserDao dao=new UserDaoImpl();
		User user=new User("admin", "123");
		//调用dao里面的方法验证登陆是否成功
		boolean flag=dao.login(user);
		if (flag) {
			System.out.println("登陆成功");
		}
		
	}
	
}
