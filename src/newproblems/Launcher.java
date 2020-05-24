package newproblems;

public class Launcher {

	public static void main(String[] args) {
		MinStack ms=new MinStack();
		ms.push(3);
		ms.push(2);
		ms.push(1);
		ms.push(9);
		ms.push(2);
		
	System.out.println(	ms.getMin());
	System.out.println(ms.top());
//	ms.pop();
//	ms.pop();
//	System.out.println(	ms.getMin());
//	ms.pop();
//	System.out.println(	ms.getMin());
//	ms.pop();
//	System.out.println(	ms.getMin());
	}

}
