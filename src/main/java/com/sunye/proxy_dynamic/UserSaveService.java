package com.sunye.proxy_dynamic;

public class UserSaveService {
	
	/*
	 * 动态代理
	 */
	public static void  jdkDynamicProxyCall() {
		
		User user1 = new User("张三", 23);
		User user2 = new User("", 24);
		User user3 = new User("李四", 151);
		
		/*
		 * 对比没有使用代理的代码，在调用时，仅仅是封装了一层代理，
		 * 其他并没有的变化，而我们可以在 UserInvocationHandler里进行我们自己的扩展和修改。
		 * 
		 */
		UserDao userDaoProxy = 
				(UserDao) new JDKDynamicProxy(new UserDaoImpl()).getProxyInstance();
		
		/* 用UserDaoImpl的子类来创建动态代理 会报出下面的异常
		 * java.lang.ClassCastException: com.sun.proxy.$Proxy0 cannot be cast to com.sunye.proxy_dynamic.UserDao
		 */
//		UserDao userDaoProxy = (UserDao) new JDKDynamicProxy(new UserDaoImpl2()).getProxyInstance();
		
		userDaoProxy.save(user1);
		userDaoProxy.save(user2);
		userDaoProxy.save(user3);
		
		//在编写完动态代理代码后，UserDao接口，增加了一个queryUsers的方法，不需做任何改变，就可以调用了。
		userDaoProxy.queryUsers();
		
	}
	
	public static void main(String[] args) {
		
		jdkDynamicProxyCall();
	}

}
