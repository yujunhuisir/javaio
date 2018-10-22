package com.proxyDyn;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		UserService userService = new UserServiceImp();
		UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), 
				userService.getClass().getInterfaces(),
				new MyDynamicProxy(userService));
		userServiceProxy.addUser();
		userServiceProxy.deleteUser();
		
	}
}
