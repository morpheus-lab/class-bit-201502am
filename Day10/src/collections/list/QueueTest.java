package collections.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue queue = new LinkedList();	// LinkedList��ü�� Queue�μ� ���
		
		// enqueue
		queue.add("A");
		queue.add("B");
		queue.add("C");
		
		// dequeue
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println(queue);
		
		// empty => Queue �������̽����� ���ǰ� ����
		
	}
	
}
