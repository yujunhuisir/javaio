package com.pattern;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
	static public final String POEM="Twas brilling,and the slithy toves\n "
			+ "Did gyre and gimble in the wabe.\n"
			+ "All mimsy were the borogoves,\n"
			+ "And the mome raths outgrabe.\n\n"
			+ "Beware the Jabberwock,my son,\n"
			+ "The jaws that bite,the claws that catch.\n"
			+ "Beware the Jubjub bird,and shun\n"
			+ "The frumious Bandersnatch.";
	public static void main(String[] args) {
		test1();
		//testNoDaXieNoReplate();
	}
	
	public static void test1() {
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
		while(m.find()) {
			
			for(int j=0;j<=m.groupCount();j++) {
				System.out.print("["+m.group(j)+"]");
			}		
			System.out.println();
		}
	}
	public static void testNoDaXieNoReplate() {
		Set<String>set = new HashSet<String>();
		
		Matcher m = Pattern.compile("\\b((?![A-Z])\\w+)\\b").matcher(POEM);
		while(m.find()) {
			//System.out.print(m.groupCount());
			set.add(m.group(1));
			
		}
		System.out.print(set.toString()+" ");
	}
}
