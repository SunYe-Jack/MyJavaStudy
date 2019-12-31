package com.sunye.proxy_cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;

public class UserCglibDynamicProxy implements MethodInterceptor{

	/* 被代理的对象*/
	private Object target;
	
	public UserCglibDynamicProxy(Object object){
		
		this.target = object;
	}
	
	public Object getProxyInstance() {
		
		Enhancer en = new Enhancer();
		/* 通过子类继承的方式，动态的创建一个被代理类的子类	*/
		en.setSuperclass(target.getClass());
		/* 回调函数 会调用intercept方法 */
		en.setCallback(this);
		return en.create();
	}
	
	private boolean checkSaveUserParam(String methodName, Object[] args) {
		
//		---------------扩展和修改的代码-----------------------------------------
		if(!(target instanceof UserDaoImpl)) {
			
			return true;
		}
		
		if(methodName == null || methodName.length() == 0 || !("save".equals(methodName))) {
			
			return true;
		}
		
		if(args == null || args.length < 1) {
			
			return true;
		}
		if(!(args[0] instanceof User)) {
			
			return true;
		}
			
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
	
		return true;
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		/* 可在此方法中做扩展*/
		
		if(checkSaveUserParam(arg1.getName(), arg2)) {
			
			return arg1.invoke(target, arg2);
		}
		
		return false;

	}

}
