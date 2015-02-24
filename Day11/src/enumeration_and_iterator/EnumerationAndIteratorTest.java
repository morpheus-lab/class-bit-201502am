package enumeration_and_iterator;

import java.util.*;

public class EnumerationAndIteratorTest {
	
	public static void main(String[] args) {
		
		System.out.println("Vector - Enumeration 테스트");
		
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
		System.out.println(en.nextElement());	// NoSuchElementException 발생
		*/
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		System.out.println();
		System.out.println("HashSet - Iterator 테스트");
		
		HashSet set = new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		System.out.println(set);
		
		// Iterator 객체 생성
		Iterator iter = set.iterator();
		/*
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());	// NoSuchElementException 발생
		*/
		
		while (iter.hasNext()) {	// 데이터 남아 있는지 조사 후
			System.out.println(iter.next());	// 데이터를 이용하도록
		}
		
	}
	
}








