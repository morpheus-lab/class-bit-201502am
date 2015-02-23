package maps;

import java.util.Hashtable;

public class HashtableTest {
	
	public static void main(String[] args) {
		
//		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		Hashtable ht = new Hashtable();
		
		ht.put("A", new String("a"));
		ht.put("B", new String("b"));
		ht.put("C", new String("c"));
		ht.put("C", new String("d"));	// 키 값이 중복되면, 이전 값을 덮어 씀
		
		System.out.println(ht);
		
		System.out.println(ht.get("A"));
		
		System.out.println(ht.containsKey("B"));
		System.out.println(ht.containsKey("D"));
		
		System.out.println(ht.contains("a"));
		
	}
	
}
