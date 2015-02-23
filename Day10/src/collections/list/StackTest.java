package collections.list;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
//		Stack<Object> stack = new Stack<Object>();
		
		// 데이터 저장 => push
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("stack: " + stack);
		
		System.out.println();
		
		// 데이터 꺼냄 => pop
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// 데이터 조회 (삭제하지 않고) => peek
//		System.out.println("stack.peek(): " + stack.peek());
//		System.out.println("stack: " + stack);
//		System.out.println("stack.peek(): " + stack.peek());
//		System.out.println("stack: " + stack);
//		System.out.println("stack.peek(): " + stack.peek());
//		System.out.println("stack: " + stack);
		
		System.out.println();
		
		// 비어있는지 검사
		System.out.println("stack.empty(): " + stack.empty());
		
		
	}
	
}


























