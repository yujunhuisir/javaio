package com.io.stream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class FormattedMemoryInput {
	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(
				new ByteArrayInputStream(
						BufferedInputFile.read("pom.xml").getBytes()));
//		while(true)
//			System.out.print((char)dis.readByte()+" ");
		while(dis.available()!=0)
			System.out.print((char)dis.readByte()+" ");
			
	}
}
