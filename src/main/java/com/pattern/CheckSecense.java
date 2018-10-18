package com.pattern;

import java.util.regex.Pattern;

public class CheckSecense {
	static String s=Splitting.knights;
	public static boolean checkScenseIsdaxiezimuAndjuhao(String scense) {
		String regex="^[A-Z].*[\\.]$";
		return Pattern.matches(regex, s);
	}
	public static void main(String[] args) {
		System.out.println(checkScenseIsdaxiezimuAndjuhao(s));
	}
}
