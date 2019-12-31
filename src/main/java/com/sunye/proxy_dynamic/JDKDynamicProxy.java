package com.sunye.proxy_dynamic;

import java.lang.reflect.Proxy;

public class JDKDynamicProxy {
	
	private Object target;
	
	public JDKDynamicProxy(Object obj) {
		
		// 要代理的目标对象,以Object的方式(不再是接口)传递
		this.target = obj;
	}
	
	public Object getProxyInstance() {
	
//		UserDao userDao = new UserDaoImpl();
		
		/*
		 * 假如UserDaoImpl不是基于接口的实现，会编译报错。
		 * UserDaoImpl userDao = new UserDaoImpl();
		 * UserDaoImpl userDaoProxy = (UserDao) Proxy.newProxyInstance(
		 */
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				new UserInvocationHandler(target));
	}


}
