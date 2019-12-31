package com.sunye.proxy_cglib;

public class UserSaveService {
	
	/*
	 * 动态代理
	 */
	public static void  cglibDynamicProxyCall() {
		
		User user1 = new User("张三", 23);
		User user2 = new User("", 24);
		User user3 = new User("李四", 151);
		
		/*
		 * 对比没有使用代理的代码，在调用时，仅仅是封装了一层代理，
		 * 其他并没有的变化，而我们可以在 UserInvocationHandler里进行我们自己的扩展和修改。
		 * 
		 */
		UserDaoImpl userDaoProxy = 
				(UserDaoImpl) new UserCglibDynamicProxy(new UserDaoImpl()).getProxyInstance();
		
		userDaoProxy.save(user1);
		userDaoProxy.save(user2);
		userDaoProxy.save(user3);
		
		//在编写完动态代理代码后，UserDao接口，增加了一个queryUsers的方法，不需做任何改变，就可以调用了。
		userDaoProxy.queryUsers();
		
	}
	
	public static void main(String[] args) {
		
		cglibDynamicProxyCall();
	}

}
