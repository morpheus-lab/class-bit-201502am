package collections.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue queue = new LinkedList();	// LinkedList객체를 Queue로서 사용
		
		// enqueue
		queue.add("A");
		queue.add("B");
		queue.add("C");
		
		// dequeue
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println(queue);
		
		// empty => Queue 인터페이스에는 정의가 없음
		
	}
	
}
