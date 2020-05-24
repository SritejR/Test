package strings;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main(String[] args) {
		
		String str1="Mary";
		String str2="Army";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char [] chars1=str1.toCharArray();
		char [] chars2=str1.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		String s1=new String(chars1);
		String s2=new String(chars2);
		

		
		
		if(s1.equals(s2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("No-way");
		}
		
	}

}
