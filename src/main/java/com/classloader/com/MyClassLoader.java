package com.classloader.com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader{
	private final static Path DEFAULT_CLASS_DIR = Paths.get("D:", "classloader1");
	
	private final Path classDir;
	public MyClassLoader() {
		super();
		this.classDir = DEFAULT_CLASS_DIR;
	}
	public MyClassLoader(String classDir) {
		super();
		this.classDir=Paths.get(classDir);
	}
	public MyClassLoader(String classDir,ClassLoader parent) {
		super(parent);
		this.classDir = Paths.get(classDir);
	}
	@Override
	protected Class<?>findClass(String name) throws ClassNotFoundException{
		
		byte[] classBytes = this.readClassByBytes(name);
		if(null==classBytes ||classBytes.length==0) {
			throw new ClassNotFoundException("Can not load the class "+name);
		}
		return this.defineClass(name, classBytes, 0, classBytes.length);
	}
	private byte[] readClassByBytes(String name) throws ClassNotFoundException {
		String classpath = name.replace(".", "/");
		Path classFullPath = classDir.resolve(Paths.get(classpath+".class"));
		if(!classFullPath.toFile().exists()) {
			throw new ClassNotFoundException("The class "+name+" not found");
		}
		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()){
			Files.copy(classFullPath, baos);
			return baos.toByteArray();
		} catch (IOException e) {
			throw new ClassNotFoundException("load the class "+name+" occur error",e);
		}
	}
	
	public String toString() {
		return "My ClassLoader";
	}
}
