package com.sunye.proxy_nouse;

/**
 * @author duolu
 * 
 * 业务服务层
 * 基于接口来做时：
 * 接口的命名以 Service为后缀
 * 接口的实现以 ServiceImpl为后缀
 *
 */
public class UserSaveService {
	
	public static void  indirectCall() {
		
		User user1 = new User("张三", 23);
		User user2 = new User("", 24);
		
		UserDao userDao = new UserDaoImpl();
		userDao.save(user1);
		
		userDao.save(user2);
	}
	
	public static void main(String[] args) {
		
		indirectCall();
	}

}
