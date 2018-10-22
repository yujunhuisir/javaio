package com.proxyDyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyDynamicProxy implements InvocationHandler {
	private Object target;
	
	public MyDynamicProxy(Object target) {
		this.target= target;
	}
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("目标对象方法之前。。。。。。。。。。。");
		Object result = method.invoke(target, args);
		System.out.println("目标对象方法之后。。。。。。。。。。。");
		return result;
	}

}
