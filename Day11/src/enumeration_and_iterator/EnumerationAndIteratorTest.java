package enumeration_and_iterator;

import java.util.*;

public class EnumerationAndIteratorTest {
	
	public static void main(String[] args) {
		
		System.out.println("Vector - Enumeration �׽�Ʈ");
		
		Vector v = new Vector();
		
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		
		System.out.println(v);
		
		Enumeration en = v.elements();
		/*
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());	// NoSuchElementException �߻�
		*/
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println();
		System.out.println("HashSet - Iterator �׽�Ʈ");
		
		HashSet set = new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		System.out.println(set);
		
		// Iterator ��ü ����
		Iterator iter = set.iterator();
		/*
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());	// NoSuchElementException �߻�
		*/
		
		while (iter.hasNext()) {	// ������ ���� �ִ��� ���� ��
			System.out.println(iter.next());	// �����͸� �̿��ϵ���
		}
		
	}
	
}








