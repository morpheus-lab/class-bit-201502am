package maps;

import java.util.*;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		String str;
		
//		HashSet<Object> set = new HashSet<Object>();
		HashSet set = new HashSet();
		
		// ������ �߰� - add()
		set.add("A");
		set.add("B");
		set.add("C");
		
		System.out.println("size: " + set.size());
		System.out.println();
		
		System.out.println(set);
		System.out.println();
		
		set.add("C");
		
		System.out.println(set);
		System.out.println();
		
		// ������ ���� ���� - contains()
		boolean existsB = set.contains("B");
		System.out.println("B�� " + (existsB ? "�ִ�." : "����."));	// (���ǽ�) ? (���϶�) : (�����϶�)
		System.out.println();
		
		// ������ ���� - remove()
		set.remove("A");
		
		System.out.println("size: " + set.size());
		System.out.println();
		
		System.out.println(set);
		System.out.println();
		
	}
	
}
