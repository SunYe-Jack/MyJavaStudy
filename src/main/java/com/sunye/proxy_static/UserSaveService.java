package com.sunye.proxy_static;


public class UserSaveService {
	
	public static void  proxyCall() {
		
		User user1 = new User("张三", 23);
		User user2 = new User("", 24);
		User user3 = new User("李四", 151);
		
		UserDao proxyDao = new UserDaoProxy(new UserDaoImpl());
		
		proxyDao.save(user1);
		proxyDao.save(user2);
		proxyDao.save(user3);
	}
	
	public static void main(String[] args) {
		
		proxyCall();
	}

}
