package collections.linkedlist;

public class MyLinkedList {
	
	MyNode head;	// 첫 번째 데이터 노드
	
	private MyNode getLastNode() {	// 마지막 노드 리턴하는 메소드
		MyNode last = null;
		if (head != null) {
			last = head;
			while (last.link != null) {
				last = last.link;
			}
		}
		return last;
	}
	
	// add - 데이터를 추가하고 추가 성공여부를 boolean 값으로 리턴
	public boolean add(Object e) {
		
		// 연결리스트가 비어 있는 경우
		// 첫 데이터가 들어오는 경우
		if (head == null) {
			MyNode newNode = new MyNode();
			newNode.data = e;
			newNode.link = null;
			
			head = newNode;
		}
		// 연결리스트가 비어 있지 않은 경우
		// (두 번째 데이터 부터)
		else {
			// 마지막 노드를 찾아서 (마지막 노드 == link가 null인 놈)
			MyNode lastNode = head;
			while (lastNode.link != null) {
				lastNode = lastNode.link;
			}
			// while문을 빠져나오면, lastNode는 마지막 노드를 가리키는 참조값
			
			// 새 노드 생성
			MyNode newNode = new MyNode();
			newNode.data = e;
			newNode.link = null;
			
			// 새 노드를 마지막 노드의 다음이 되도록
			lastNode.link = newNode;
		}
		
		return true;
	}
	
	public boolean addFirst(Object e) {
		MyNode newNode = new MyNode();
		newNode.data = e;

		// 연결리스트가 비어있지 않은 경우
		if (head != null) {
			newNode.link = head;	// 새 노드의 다음이 현재 head가 되도록
		}
		head = newNode;
		
		return true;
	}
	
	public boolean addLast(Object e) {	// 마지막 노드 뒤에 새 데이터 이어 붙이기
		// 새 노드 생성, 새 노드의 data를 e로
		MyNode newNode = new MyNode();
		newNode.data = e;
		// 마지막 노드를 찾고
		MyNode lastNode = null;
		if (head != null) {
			lastNode = head;
			while (lastNode.link != null) {
				lastNode = lastNode.link;
			}
			// while문을 빠져 나오면 lastNode는 마지막 노드(link가 null인 노드)를 가리킴
			
			// 마지막 노드의 link를 새 노드로
			lastNode.link = newNode;
		} else {	// head가 null이라면?
			head = newNode;
		}
		return true;
	}
	
	public int size() {	// 저장된 데이터 개수 반환
		int size = 0;
		if (head != null) {
			MyNode node = head;
			while (node != null) {
				size++;
				node = node.link;
			}
		}
		return size;
	}
	
	public Object element() {	// 첫 번째 데이터 반환
		return getFirst();
	}
	
	public Object getFirst() {	// 첫 번째 데이터 반환
		return head == null ? null : head.data;
	}
	
	public Object getLast() {	// 마지막 데이터 반환
		MyNode lastNode = getLastNode();
		return lastNode == null ? null : lastNode.data;
	}
	
	public Object get(int index) {	// index 인덱스 데이터 반환
		// TODO
		return null;
	}
	
	public Object remove() {	// 첫 번째 데이터를 삭제하고 그 데이터 반환
		Object data = null;
		if (head != null) {
			head = head.link;
			data = head.data;
		}
		return data;
	}
	
	public Object remove(int index) {	// index 인덱스의 데이터를 삭제하고 그 데이터 반환
		// index < 0
		if (index < 0) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		// 연결리스트가 비어 있는 경우
		if (head == null) {
			throw new IndexOutOfBoundsException("EMPTY");
		}
		
		// index == 0이라면? head를 의미
		
		// index == 1이라면? 두 번째 데이터
		
		MyNode deleteNode = head;	// 삭제할 노드를 기억할 변수
		MyNode prevNode = null;	// 삭제할 노드의 이전 노드를 기억할 변수
		
		for (int i = 0; i < index; i++) {
			prevNode = deleteNode;
			deleteNode = deleteNode.link;
		}
		// for 문을 빠져나오면, deleteNode는 index 인덱스의 데이터를 가리킴
		
		try {
			// 삭제할 노드 이전 노드의 link 값을 삭제할 노드의 link 값으로
			if (prevNode != null) {
					prevNode.link = deleteNode.link;
			}
			// 삭제할 노드의 link 값을 null로
			deleteNode.link = null;
		} catch (NullPointerException e) {
			throw new IndexOutOfBoundsException("TOO BIG INDEX");
		}
		
		// 삭제할 노드의 data를 리턴
		return deleteNode.data;
	}
	
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		Object data = null;
		
		// link가 null인 노드를 찾아서 삭제 및 데이터 반환
		if (head == null) {
			throw new IndexOutOfBoundsException("EMPTY");
		}
		else {
			MyNode prevNode = null;
			MyNode delNode = head;
			while (delNode.link != null) {
				prevNode = delNode;
				delNode = delNode.link;
			}
			// while문 빠져 나오면, delNode는 마지막 노드, prevNode는 그 앞 노드를 가리킴
			
			prevNode.link = null;
			data = delNode.data;
		}
		
		return data;
	}
	
	
	// toString() 재정의
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		MyNode node = head;
		while (node != null) {
			if (node != head) {	// 두 번째 노드부터는 콤마가 추가되도록
				sb.append(", ");
			}
			sb.append(node.data);
			node = node.link;
		}
		// while문을 빠져나오면 마지막 노드까지 모두 sb에 append하게 됨
		
		sb.append("]");
		return sb.toString();
	}
	
}































