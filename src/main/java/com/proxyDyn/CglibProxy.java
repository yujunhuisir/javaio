package com.proxyDyn;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("目标对象方法之前。。。。。。。。。。。");
		Object o = methodProxy.invokeSuper(obj, args);
		System.out.println("目标对象方法之后。。。。。。。。。。。");
		return o;
	}

}
