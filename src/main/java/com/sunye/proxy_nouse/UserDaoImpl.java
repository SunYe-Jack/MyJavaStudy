package com.sunye.proxy_nouse;

public class UserDaoImpl implements UserDao{

	public boolean save(User user) {
		
		System.out.println("保存用户 : " + user.getName() + ", " + user.getAge());
		return true;
	}
}
