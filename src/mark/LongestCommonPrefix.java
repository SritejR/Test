package mark;

public class LongestCommonPrefix {
	public static String lcm(String [] strings) {
	
		String lcp=strings[0];
		
		for(int i=1;i<strings.length;i++) {
			int j=0;
			String currentWord=strings[i];
			if(lcp.length()==0) {
				return "";
			}
			while(j<lcp.length()&&j<currentWord.length()&&lcp.charAt(j)==currentWord.charAt(j)) {
				j++;
				
			}
			if(j==0) {
				return "";
			}
			
			lcp=currentWord.substring(0,j);
		}
		
		
		return lcp;
	}
	
	public static void main(String[] args) {
		
		String [] str= {"cat","camera","cap"};
		System.out.println(lcm(str));
	}

}
