package com.io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	static String file="basicFileOut.out";
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new StringReader(BufferedInputFile.read("pom.xml")));
		PrintWriter out = new PrintWriter(file);
		int linecount=1;
		String s;
		while((s=br.readLine())!=null)
			out.println(linecount++ +":\n "+s);
		out.close();
		
		System.out.println(BufferedInputFile.read(file));
	}
}
