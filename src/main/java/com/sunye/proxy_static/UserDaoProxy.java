package com.sunye.proxy_static;

public class UserDaoProxy implements UserDao{

	private UserDao target;
	
	public UserDaoProxy(UserDao dao) {
		
		this.target = dao;
	}
	
	@Override
	public boolean save(User user) {
		
		if(user.getName() == null || user.getName().trim().length() == 0) {
			
			System.out.println("姓名为空：保存失败！！");
			return false;
		}
		
		if(user.getAge() == null ||( user.getAge() < 0 || user.getAge() > 150)) {
			
			System.out.println("年龄不符：保存失败！！");
			return false;
		}
		
		return target.save(user);
	}

}
