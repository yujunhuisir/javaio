package com.java.io.my;

import java.io.File;

public class DirectoryDemo {
	public static void main(String[] args) {
		PPrint.pprint(Directory.walk(".").dirs);
		for(File file : Directory.local(".", "T.*"))
			System.out.println(file);
		
		for(File file:Directory.local(".","T.*\\.java"))
			System.out.println(file);
		//for(File file:Directory.local(".","*[Zz].*\\.class"))
			//System.out.println(file);
		
	}
}
