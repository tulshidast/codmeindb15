package javapractices;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(5);
		stack.add(7);
		stack.add(20);
		stack.add(100);
		stack.add(null);
		stack.add(5);

		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}

	}

}
