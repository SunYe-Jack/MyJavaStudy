package com.sunye.proxy_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author duolu
 * JDK 动态代理的事件处理器， 需要实现 InvocationHandler 这个接口
 */
public class UserInvocationHandler implements InvocationHandler{

	public Object obj;
	
	public UserInvocationHandler(Object obj) {
		
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//		---------------扩展和修改的代码-----------------------------------------
		if(args != null && "save".equals(method.getName())){
			
			if(args[0] instanceof User) {
				
				System.out.println("参数1是User");
				
				User user = (User) args[0];
				
				if(user.getName() == null || user.getName().trim().length() == 0) {
					
					System.out.println("姓名为空：保存失败！！");
					return false;
				}
				
				if(user.getAge() == null || user.getAge() < 0 || user.getAge() > 150) {
					
					System.out.println("年龄不符：保存失败！！");
					return false;
				}
			}
		}
		
//		------------------完美的分割线----------------------------------------------------
//		System.out.println("开始执行 invoke..");
		Object result = method.invoke(obj, args);
//		System.out.println("执行结束 invoke..");
		return result;
	}

	
}
