package newproblems;

import java.util.Stack;

public class MinStack {
	Stack<Integer> stack;
	Stack<Integer> minStack;
	public MinStack() {
		stack=new Stack<Integer>();
		minStack=new Stack<Integer>();
	}
	public  void push(int num) {
		
		
		int min=num;
		
			if(!minStack.isEmpty()&&min>minStack.peek()) {
				min=minStack.peek();
			}
				stack.push(num);
				minStack.push(min);
			
		}
		
		public int top() {
			return stack.peek();
		}
		
		public int getMin() {
			return minStack.peek();
		}
		
		public void pop() {
			stack.pop();
			minStack.pop();
		}
		
		
	
	
//	public static void main(String[] args) {
//		
//	}

}
