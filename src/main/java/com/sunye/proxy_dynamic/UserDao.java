package com.sunye.proxy_dynamic;

import java.util.List;

public interface UserDao {

	public boolean save(User user);
	
	List<User> queryUsers();
}
