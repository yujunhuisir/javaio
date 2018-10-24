package com.io.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BufferedInputFile {
/*
 * ª∫≥Â ‰»ÎŒƒº˛
 */
	public static String read(String filename) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb = new StringBuilder();
		while((s=in.readLine())!=null) {
			sb.append(s);
		}
		in.close();
		return sb.toString();
	}
	public static void main(String[] args) throws Exception {
		//System.out.println(read("pom.xml"));
		List<String>list = testReader7("pom.xml");
		for(ListIterator<String> it = list.listIterator(list.size());it.hasPrevious();)
			System.out.println(it.previous());
	}
	
	public static List<String> testReader7(String filename) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		List<String> list= new LinkedList<String>();
		while((s=in.readLine())!=null)
			list.add(s);
		in.close();
		return list;
	}
}
