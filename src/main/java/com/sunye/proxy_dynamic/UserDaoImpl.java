package com.sunye.proxy_dynamic;

import java.util.List;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean save(User user) {
		
		System.out.println("保存用户 : " + user.getName() + ", " + user.getAge());
		return true;
	}

	@Override
	public List<User> queryUsers() {
		
		System.out.println("全部用户查询完毕.. ");
		return null;
	}
}
