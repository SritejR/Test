package strings;

import java.util.Stack;

public class Parentisis {
	
	public static boolean isValid(String str) {
		
		Stack<Character> sta=new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[') {
				sta.push(str.charAt(i));
			}
			
			else if(str.charAt(i)=='}'||str.charAt(i)==')'||str.charAt(i)==']') {
				return false;
			}
			
			else if(!sta.isEmpty() && (str.charAt(i)==']' && sta.peek()=='[') ||
					(str.charAt(i)==')' && sta.peek()=='(') || 
					(str.charAt(i)=='}' && sta.peek()=='{')) {
				sta.pop();
			}else {
				sta.push(str.charAt(i));
			}
		}
		
		return sta.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String str="}{]]})";
		System.out.println(isValid(str));
		
	}

}
