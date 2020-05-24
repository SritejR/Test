package mark;

import java.util.HashSet;
import java.util.Set;

public class MaxCounter {
	public static int maxCount(String str) {
		int i=0;
		int j=0;
		int maxCount=0;
		Set<Character> hs=new HashSet<Character>();
		while(i<str.length() && j<str.length()) {
		
		if(!hs.contains(str.charAt(j))) {
			hs.add(str.charAt(j));
			j++;
			maxCount=Math.max(maxCount, j-i);
		}else {
			hs.remove(str.charAt(i));
			i++;
		}
		
	}
		return maxCount;
	}
	
	public static void main(String[] args) {
		
		String str="abcdabcde";
		System.out.println(maxCount(str));
		
	}

}
