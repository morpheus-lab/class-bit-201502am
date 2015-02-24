package io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

	public UpperCaseInputStream(InputStream in) {
		super(in);	// FilterInputStream ������ ȣ��
	}
	
	@Override
	public int read() throws IOException {
		int d = super.read();	// �����ڷ� ���޹��� ���� InputStream ��ü�κ��� read()
		
		if (d >= 97 && d <= 122) {	// d�� �ҹ��� �����̸�
			// �빮�ڷ� ��ȯ
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
			// �ҹ��� -> �빮��
			if (b[i] >= 'a' && b[i] <= 'z') {
				b[i] -= ('a' - 'A');
			}
		}
		
		return count;
	}

}
