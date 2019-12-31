package com.sunye.proxy_cglib;

import java.util.List;

public class UserDaoImpl{

	public boolean save(User user) {
		
		System.out.println("保存用户 : " + user.getName() + ", " + user.getAge());
		return true;
	}

	public List<User> queryUsers() {
		
		System.out.println("全部用户查询完毕.. ");
		return null;
	}
}
