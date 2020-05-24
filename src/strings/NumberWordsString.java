package strings;

public class NumberWordsString {
	
	public static void main(String[] args) {
		
		String s="I love my India";
		String [] words=s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+ " ");
		}
	}

}
