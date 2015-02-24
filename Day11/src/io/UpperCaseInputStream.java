package io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

	public UpperCaseInputStream(InputStream in) {
		super(in);	// FilterInputStream 생성자 호출
	}
	
	@Override
	public int read() throws IOException {
		int d = super.read();	// 생성자로 전달받은 내부 InputStream 객체로부터 read()
		
		if (d >= 97 && d <= 122) {	// d가 소문자 문자이면
			// 대문자로 변환
			d -= 32;
		}
		
//		if (d >= 'a' && d <= 'z') {
//			d -= ('a' - 'A');
//		}
		
		return d;
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int count = super.read(b, off, len);
		
		for (int i = off; i < off + count; i++) {
			// 소문자 -> 대문자
			if (b[i] >= 'a' && b[i] <= 'z') {
				b[i] -= ('a' - 'A');
			}
		}
		
		return count;
	}

}
