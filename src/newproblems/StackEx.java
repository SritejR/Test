package newproblems;

public class StackEx {
	
	private int capacity;
	private int [] arr;
	private int top;
	
	
	public StackEx(int capacity) {
		this.capacity=capacity;
		this.arr=new int[capacity];
		this.top=-1;
	}
	
	public void push(int num) {
		if(isFull()) {
			throw new RuntimeException("Stack is full");
		}
		arr[++top]=num;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull() {
		return top==capacity-1;
	}

	public boolean isEmpty() {
		return top==-1;
	}
}
