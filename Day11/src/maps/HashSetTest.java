package maps;

import java.util.*;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		String str;
		
//		HashSet<Object> set = new HashSet<Object>();
		HashSet set = new HashSet();
		
		// 데이터 추가 - add()
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
		
		// 데이터 존재 여부 - contains()
		boolean existsB = set.contains("B");
		System.out.println("B가 " + (existsB ? "있다." : "없다."));	// (조건식) ? (참일때) : (거짓일때)
		System.out.println();
		
		// 데이터 삭제 - remove()
		set.remove("A");
		
		System.out.println("size: " + set.size());
		System.out.println();
		
		System.out.println(set);
		System.out.println();
		
	}
	
}
