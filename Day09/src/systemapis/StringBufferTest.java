package systemapis;

public class StringBufferTest {
	
	public static void main(String[] args) {
		
//		StringBuffer sb = new StringBuffer();		// �� ���� ����
		StringBuffer sb = new StringBuffer("apple");	// �ʱⰪ �����ϴ� ������
//		StringBuffer sb = new StringBuffer(100);	// ������ ũ�⸦ �����ϴ� ������
		
		sb.append(1);			// + 1
		sb.append(",banana");	// + ",banana"
		sb.append(",");			// + ","
		sb.append(true);		// + true
		
		sb.setCharAt(1, 'z');	// ù��° �Ķ���� �ε��� ���ڸ�
								// �ι�° �Ķ���� ���ڷ� ����
		
		sb.insert(2, "ZZZ");	// ù��° �Ķ���� �ε��� ��ġ��
								// �ι�° �Ķ���� ���ڸ� ����
		
		// toString()���� String ��ü ����
		String s = sb.toString();
		
		System.out.println(s);
		
		System.out.println("----------------------------------");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("mango").append(",").append("orange");
		
	}
	
}































