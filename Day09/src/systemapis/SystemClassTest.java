package systemapis;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SystemClassTest {
	
	public static void main(String[] args) {
		
		// ǥ�� ��� ��Ʈ�� (�����Ͱ� �帣�� ���; �ܹ���)
		PrintStream outStream = System.out;	// �ܼ�(Ŀ�ǵ�â)
		
		// ǥ�� �Է� ��Ʈ��
		InputStream inStream = System.in;	// Ű���� �Է�
		
		// ���� �ð� (1970-01-01 00:00:00.000 ����, ��� �ð�(ms ����))
		long currentTime = System.currentTimeMillis();
//		System.out.println(currentTime);
//		System.out.println(currentTime / 1000 / 3600 / 24 / 365);
		
		// ������ �÷��� ����
		System.gc();
		
		// System.getenv() => �ý��� ȯ�� ������ Map���·� ����
		Map env = System.getenv();	// Map: key-value ������ �̷���� �����͸� �����ϴ� �ڷᱸ��
		Set keys = env.keySet();	// Map�� key�� ����
		Iterator keyIter = keys.iterator();	// ������ ������ key������ �ϳ��� ��ȸ�� �� �ִ� �ڷᱸ��
		while (keyIter.hasNext()) {	// ��ȸ�� ���� �����ִ� ���� �ݺ�
			Object key = keyIter.next();
			Object value = env.get(key);
			
			System.out.println(key + " = " + value);
		}
		
	}
	
}














