package strings;

import java.util.Stack;

public class StringReversal {
	
	public static void main(String[] args) {
		
		String s="madam";
		String temp=s;
		StringBuilder sb=new StringBuilder();
		
		Stack<Character> sta=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			sta.push(s.charAt(i));
		}
		
		while(!sta.isEmpty()) {
//			System.out.print(sta.pop());
			sb.append(sta.pop());
		}
		
		System.out.println(sb);
		System.out.println();
		if(temp.equals(sb)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NO WAY");
		}
	}

}
