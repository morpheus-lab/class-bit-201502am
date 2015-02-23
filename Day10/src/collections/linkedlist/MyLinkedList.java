package collections.linkedlist;

public class MyLinkedList {
	
	MyNode head;	// ù ��° ������ ���
	
	// add - �����͸� �߰��ϰ� �߰� �������θ� boolean ������ ����
	public boolean add(Object e) {
		
		// ���Ḯ��Ʈ�� ��� �ִ� ���
		// ù �����Ͱ� ������ ���
		if (head == null) {
			MyNode newNode = new MyNode();
			newNode.data = e;
			newNode.link = null;
			
			head = newNode;
		}
		// ���Ḯ��Ʈ�� ��� ���� ���� ���
		// (�� ��° ������ ����)
		else {
			// ������ ��带 ã�Ƽ� (������ ��� == link�� null�� ��)
			MyNode lastNode = head;
			while (lastNode.link != null) {
				lastNode = lastNode.link;
			}
			// while���� ����������, lastNode�� ������ ��带 ����Ű�� ������
			
			// �� ��� ����
			MyNode newNode = new MyNode();
			newNode.data = e;
			newNode.link = null;
			
			// �� ��带 ������ ����� ������ �ǵ���
			lastNode.link = newNode;
		}
		
		return true;
	}
	
	public boolean addFirst(Object e) {
		MyNode newNode = new MyNode();
		newNode.data = e;

		// ���Ḯ��Ʈ�� ������� ���� ���
		if (head != null) {
			newNode.link = head;	// �� ����� ������ ���� head�� �ǵ���
		}
		head = newNode;
		
		return true;
	}
	
	public boolean addLast(Object e) {	// ������ ��� �ڿ� �� ������ �̾� ���̱�
		// TODO
		return true;
	}
	
	public int size() {	// ����� ������ ���� ��ȯ
		// TODO
		return 0;
	}
	
	public Object element() {	// ù ��° ������ ��ȯ
		// TODO
		return null;
	}
	
	public Object getFirst() {	// ù ��° ������ ��ȯ
		// TODO
		return null;
	}
	
	public Object getLast() {	// ������ ������ ��ȯ
		// TODO
		return null;
	}
	
	public Object get(int index) {	// index �ε��� ������ ��ȯ
		// TODO
		return null;
	}
	
	public Object remove() {	// ù ��° �����͸� �����ϰ� �� ������ ��ȯ
		Object data = null;
		if (head != null) {
			head = head.link;
			data = head.data;
		}
		return data;
	}
	
	public Object remove(int index) {	// index �ε����� �����͸� �����ϰ� �� ������ ��ȯ
		// index < 0
		if (index < 0) {
			throw new IndexOutOfBoundsException(Integer.toString(index));
		}
		// ���Ḯ��Ʈ�� ��� �ִ� ���
		if (head == null) {
			throw new IndexOutOfBoundsException("EMPTY");
		}
		
		// index == 0�̶��? head�� �ǹ�
		
		// index == 1�̶��? �� ��° ������
		
		MyNode deleteNode = head;	// ������ ��带 ����� ����
		MyNode prevNode = null;	// ������ ����� ���� ��带 ����� ����
		
		for (int i = 0; i < index; i++) {
			prevNode = deleteNode;
			deleteNode = deleteNode.link;
		}
		// for ���� ����������, deleteNode�� index �ε����� �����͸� ����Ŵ
		
		try {
			// ������ ��� ���� ����� link ���� ������ ����� link ������
			if (prevNode != null) {
					prevNode.link = deleteNode.link;
			}
			// ������ ����� link ���� null��
			deleteNode.link = null;
		} catch (NullPointerException e) {
			throw new IndexOutOfBoundsException("TOO BIG INDEX");
		}
		
		// ������ ����� data�� ����
		return deleteNode.data;
	}
	
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		Object data = null;
		
		// link�� null�� ��带 ã�Ƽ� ���� �� ������ ��ȯ
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
			// while�� ���� ������, delNode�� ������ ���, prevNode�� �� �� ��带 ����Ŵ
			
			prevNode.link = null;
			data = delNode.data;
		}
		
		return data;
	}
	
	
	// toString() ������
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		MyNode node = head;
		while (node != null) {
			if (node != head) {	// �� ��° �����ʹ� �޸��� �߰��ǵ���
				sb.append(", ");
			}
			sb.append(node.data);
			node = node.link;
		}
		// while���� ���������� ������ ������ ��� sb�� append�ϰ� ��
		
		sb.append("]");
		return sb.toString();
	}
	
}






























