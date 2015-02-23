package collections.list;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
//		ll.add(e);		// 연결리스트 맨 뒤에 데이터 추가
//		ll.addFirst(e);	// 연결리스트 맨 앞에 데이터 추가
//		ll.addLast(e);	// 연결리스트 맨 뒤에 데이터 추가
		
		ll.add("A");
		System.out.println(ll);
		
		ll.add("B");
		System.out.println(ll);
		
		ll.add("C");
		System.out.println(ll);
		
		ll.addFirst("Z");
		System.out.println(ll);
		
		ll.addLast("F");
		System.out.println(ll);
		
		// 저장된 데이터의 개수 조회
		System.out.println(ll.size());
		
		// 데이터 조회
		System.out.println(ll.element());	// head 데이터를 조회
		
		System.out.println(ll.getFirst());	// 첫 번째 (head) 데이터 조회
		
		System.out.println(ll.getLast());	// 마지막 데이터를 조회
		
		System.out.println(ll.get(3));		// 인덱스로 데이터를 조회
		
		// 데이터 삭제
		System.out.println("ll.remove() = " + ll.remove());	// 첫 번째 (head) 데이터를 삭제 및 반환
		System.out.println(ll);
		
		Object removed = ll.remove(2);
		System.out.println("ll.remove(2) = " + removed);
		System.out.println(ll);
		
		ll.removeFirst();	// 첫 번째 데이터를 삭제 및 반환
		ll.removeLast();	// 마지막 데이터를 삭제 및 반환
		
	}
	
}

























