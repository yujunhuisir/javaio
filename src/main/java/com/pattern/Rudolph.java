package com.pattern;

public class Rudolph {
	public static void main(String[] args) {
		for(String pattern:new String[] {"Rudolph","[Rr]udolph","[Rr][aeoiu][a-z]ol.*","R.*"})
			System.out.println("Rudolph".matches(pattern));
	}
}
