package strings;

public class LongestCommonPrefix {
	
	public static String findLcp(String [] strings) {
		String lcp=strings[0];
		for(int i=1;i<strings.length;i++) {
			String currentWord=strings[i];
			if(strings.length==0) {
				return " "; 
			}
			int j=0;
			while(j<lcp.length() && j<currentWord.length() && lcp.charAt(j)==currentWord.charAt(j)) {
				j++;
			}
			if(j==0) {
				return " ";
			}
			lcp=currentWord.substring(0,j);
		}
		return lcp ;
	}
	
	public static void main(String[] args) {
		
		String [] strings= {"cat","camera","car"};
		String lcp=findLcp(strings);
		System.out.println(lcp);
	}
	
	

}
