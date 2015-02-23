package collections.linkedlist;

public class MyLinkedListTest {
	
	public static void main(String[] args) {
		
		MyLinkedList ll = new MyLinkedList();
		
		ll.add("1");
		ll.add("2");
		ll.add("3");
		System.out.println(ll);
		
		ll.addFirst("A");
		System.out.println(ll);
		
	}
	
}
