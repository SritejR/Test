package strings;

import java.util.HashSet;
import java.util.Set;

public class MaxCountInSubStr {
	
	public static int macCount(String str) {
		int i=0;
		int j=0;
		int maxCount=0;
		int len=str.length();
		
		Set<Character> hs=new HashSet<Character>();
		
		while(i<len && j<len) {
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
		
		int res=macCount(str);
		System.out.println(res);

	}

}
