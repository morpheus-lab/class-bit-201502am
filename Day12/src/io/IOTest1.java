package io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class IOTest1 {
	
	public static void main(String[] args) throws Exception {
		
		InputStream in  = new FileInputStream("D:\\java-am\\io.txt");
		
		System.out.println((char) in.read());
		System.out.println((char) in.read());
		System.out.println((char) in.read());
		System.out.println(in.read());	// EOF
		
		in.close();
		
		System.out.println("==================================");
		
		Reader reader = new FileReader("D:\\java-am\\io.txt");
		
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println(reader.read());	// EOF
		
		reader.close();
		
	}
	
}
