package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pracise10 {
	public static void main(String[] args) {
		//testRegular1();
		test11();
//		Matcher m = Pattern.compile("\\w+").matcher("Eventing is full of the linnet's wings");
//		while(m.find())
//			System.out.print(m.group()+" ");
//		System.out.println();
//		int i=0;
//		while(m.find(i)) {
//			System.out.print(m.group()+" ");
//			i++;
//		}
	}
	//public static String s = "";
	public static void testRegular1() {
//		Pattern p = Pattern.compile("^Java");	
//		System.out.println(p.matcher(s).matches()+"-----");
//		System.out.println(s.matches("\\Breg.*"));
//		System.out.println(s.matches(""));
//		System.out.println(s.matches("s?"));
//		System.out.println(s.matches("s*"));
//		System.out.println(s.matches("s+"));
//		System.out.println(s.matches("s{4}"));
//		System.out.println(s.matches("s{1}."));
//		System.out.println(s.matches("s{0,3}"));
//		System.out.println("-----------------");
//		
//		System.out.println(b);
		
		String source="Java now has regular expressions";
		String[] regEx= {"^Java","\\Breg.*","n.w\\s+h(a|i)s","s?"};
		System.out.println("Source string:"+source);
		for(String pattern:regEx) {
			System.out.println("Regular expression:\""+pattern+"\"");
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(source);
			while(m.find()) {
				System.out.println("Match \""+m.group()+"\" at positions"+m.start()+"_"+(m.end()-1));
			}
		}
		
		
	}
	
	public static void test11() {
		Pattern p =Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		
		Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't anyo bb");
		while(m.find()) {
			System.out.println("Match\""+m.group()+"\" at positions"+m.start()+"_"+(m.end()-1));
		}
	}
}
