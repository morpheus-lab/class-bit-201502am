package collections.list;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
//		ll.add(e);		// ���Ḯ��Ʈ �� �ڿ� ������ �߰�
//		ll.addFirst(e);	// ���Ḯ��Ʈ �� �տ� ������ �߰�
//		ll.addLast(e);	// ���Ḯ��Ʈ �� �ڿ� ������ �߰�
		
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
		
		// ����� �������� ���� ��ȸ
		System.out.println(ll.size());
		
		// ������ ��ȸ
		System.out.println(ll.element());	// head �����͸� ��ȸ
		
		System.out.println(ll.getFirst());	// ù ��° (head) ������ ��ȸ
		
		System.out.println(ll.getLast());	// ������ �����͸� ��ȸ
		
		System.out.println(ll.get(3));		// �ε����� �����͸� ��ȸ
		
		// ������ ����
		System.out.println("ll.remove() = " + ll.remove());	// ù ��° (head) �����͸� ���� �� ��ȯ
		System.out.println(ll);
		
		Object removed = ll.remove(2);
		System.out.println("ll.remove(2) = " + removed);
		System.out.println(ll);
		
		ll.removeFirst();	// ù ��° �����͸� ���� �� ��ȯ
		ll.removeLast();	// ������ �����͸� ���� �� ��ȯ
		
	}
	
}

























