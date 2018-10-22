package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pracise10 {
	public static void main(String[] args) {
		testRegular1();
		Matcher m = Pattern.compile("\\w+").matcher("Eventing is full of the linnet's wings");
		while(m.find())
			System.out.print(m.group()+" ");
		System.out.println();
		int i=0;
		while(m.find(i)) {
			System.out.print(m.group()+" ");
			i++;
		}
	}
	public static String s = "Java now have regular expressions";
	public static void testRegular1() {
		Pattern p = Pattern.compile("^Java");	
		System.out.println(p.matcher(s).matches()+"-----");
		System.out.println(s.matches("\\Breg.*"));
		System.out.println(s.matches("n.w\\s+h(a|i)s"));
		System.out.println(s.matches("s?"));
		System.out.println(s.matches("s*"));
		System.out.println(s.matches("s+"));
		System.out.println(s.matches("s{4}"));
		System.out.println(s.matches("s{1}."));
		System.out.println(s.matches("s{0,3}"));
		System.out.println("-----------------");
		boolean b = p.matches("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b", "Arline ate eight apples and one orange while Anita hadn't any");
		System.out.println(b);
	}
}
