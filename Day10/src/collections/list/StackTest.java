package collections.list;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
//		Stack<Object> stack = new Stack<Object>();
		
		// ������ ���� => push
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("stack: " + stack);
		
		System.out.println();
		
		// ������ ���� => pop
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// ������ ��ȸ (�������� �ʰ�) => peek
//		System.out.println("stack.peek(): " + stack.peek());
//		System.out.println("stack: " + stack);
//		System.out.println("stack.peek(): " + stack.peek());
//		System.out.println("stack: " + stack);
//		System.out.println("stack.peek(): " + stack.peek());
//		System.out.println("stack: " + stack);
		
		System.out.println();
		
		// ����ִ��� �˻�
		System.out.println("stack.empty(): " + stack.empty());
		
		
	}
	
}


























