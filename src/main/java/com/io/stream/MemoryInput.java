package com.io.stream;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args) throws Exception {
		StringReader sr = new StringReader(BufferedInputFile.read("pom.xml"));
		int c;
		while((c=sr.read())!=-1)
			System.out.print((char)c);
	}
}
