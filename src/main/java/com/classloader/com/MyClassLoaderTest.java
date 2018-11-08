package com.classloader.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		MyClassLoader classLoader = new MyClassLoader();
		Class<?>aClass = classLoader.loadClass("HelloWord");
		
		System.out.println(aClass.getClassLoader());
		
		Object helloWord = aClass.newInstance();
		System.out.println(helloWord);
		Method welcomeMethod = aClass.getMethod("welcome");
		String result = (String) welcomeMethod.invoke(helloWord);
		System.out.println("Result:"+result);
	}
}
