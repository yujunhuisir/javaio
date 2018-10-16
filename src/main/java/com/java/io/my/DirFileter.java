package com.java.io.my;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirFileter implements FilenameFilter {
	private Pattern pattern;
	public DirFileter(String regex) {
		this.pattern =Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		boolean flag = pattern.matcher(name).matches();
		System.out.println(flag);
		return flag;
	}

}
