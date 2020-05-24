package newproblems;

public class Tester {

	public static void main(String[] args) {
		

		StackEx st=new StackEx(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
//		st.push(100);
		System.out.println(st.peek());
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
//		st.push(6);
		
		st.pop();
//		st.pop();
//		st.pop();
//		st.pop();
//		st.pop();
//		st.pop();
	}

}
