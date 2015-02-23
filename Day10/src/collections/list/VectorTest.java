package collections.list;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector v = new Vector(10);	// �ʱ�뷮: 10
		
		System.out.println("�뷮: " + v.capacity());	// ������ �뷮 ��ȸ
		System.out.println("������ ũ��: " + v.size());	// ���Ϳ� ����� ������ ����
		
		v.addElement("1");
		v.addElement("2");
		
		System.out.println("�뷮: " + v.capacity());	// ������ �뷮 ��ȸ
		System.out.println("������ ũ��: " + v.size());	// ���Ϳ� ����� ������ ����
		
		System.out.println(v);
		
		v.insertElementAt("3", 1);
		
		System.out.println("�뷮: " + v.capacity());	// ������ �뷮 ��ȸ
		System.out.println("������ ũ��: " + v.size());	// ���Ϳ� ����� ������ ����
		
		System.out.println(v);
		
		System.out.println();
		
		// a���� ������� 10���� ���� ��ü�� ����
		for (int i = 0; i < 10; i++) {
//			Character c = new Character((char)('a' + i));
//			v.addElement(c);
			
			v.addElement((char)('a' + i));	// => char �����Ͱ� �ڵ����� Wrapper ��ü�� Character ��ü�� ��ȯ�Ǿ� �����
			
			System.out.println(v);
			
			System.out.println("�뷮: " + v.capacity());	// ������ �뷮 ��ȸ
			System.out.println("������ ũ��: " + v.size());	// ���Ϳ� ����� ������ ����
			
			System.out.println();
		}
		
		// ��ü���� (���� ������ ��ȸ)
		// �ε����� ��ü ���� (��ȸ)
		Object data = v.elementAt(7);
		Character ch = (Character) data;	// ���� elementAt �޼ҵ�� �⺻������ Object Ÿ������ ��ȯ
											// ������ Ÿ������ �ٽ� ����ȯ�� �ؼ� ���
		System.out.println(data);
		
		data = v.elementAt(9);
		System.out.println(data);
		
		// ��ü�� �ε��� ��ȣ ��ȸ
		int index = v.indexOf(new Character('a'));
		System.out.println(index);
		
		// ��ü ����	=> remove �޼ҵ�
		v.remove(0);	// �ε����� ��ü ����
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		v.remove(data);		// ���������� ��ü ����
		// data ��ü�� 'g' Character ��ü
		System.out.println(v);
		
		
		// ��ü ���� ��ȸ
		boolean exists3 = v.contains("3");
		System.out.println("v.containts(\"3\") = " + exists3);
		
		System.out.println("v.containts(\"2\") = " + v.contains("2"));
		
		System.out.println();
		
		// ���� v�� ���� �����͸� ���� �ִ� ���� ��ü ����
		Vector v2 = (Vector) v.clone();
		System.out.println("���� ��ü ���� �Ϸ�");
		
		System.out.println("v  = " + v);
		System.out.println("v2 = " + v2);
		System.out.println("v == v2: " + (v == v2)); // v�� v2�� �ٸ� ��ü���� �� �� ����
	}
	
}































