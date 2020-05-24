package strings;

import java.util.Stack;

public class RemoveConsecutiveDup {
	
	public static StringBuilder removeConDup(String str) {
		
		StringBuilder sb=new StringBuilder();
		Stack<Character> sta=new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			if(!sta.isEmpty() && sta.peek()!=str.charAt(i)) {
				sta.push(str.charAt(i));
			}else if(!sta.isEmpty() && sta.peek()==str.charAt(i)) {
				sta.pop();
			}else {
				sta.push(str.charAt(i));
			}
			
		}
		
		while(!sta.isEmpty()) {
			sb.append(sta.pop());
		}
		
		return sb;
	}
	
	public static void main(String[] args) {
		
		String s="abbaca";
		StringBuilder res=removeConDup(s);
		for(int i=res.length()-1;i>=0;i--) {
			System.out.print(res.charAt(i)+" ");
		}
		
	}

}
