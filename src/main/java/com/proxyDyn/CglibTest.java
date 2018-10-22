package com.proxyDyn;

import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserServiceImp.class);
		enhancer.setCallback(cglibProxy);
		UserService userService = (UserService) enhancer.create();
		userService.addUser();
		userService.deleteUser();
		
	}
}
