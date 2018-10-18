package com.pattern;

import java.util.Arrays;

public class Splitting {
	public static String knights="Then when you have found the shrubbery. you must "
			+ "cut down the mightiest tree in the forest... "
			+ "with... a herring! a.";
	
	public  static void spilt(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	public static void main(String[] args) {
		spilt(" ");
		spilt("\\W+");
		spilt("n\\W+");
		spilt("the|you");
	}
}
