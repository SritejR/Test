package mark;

public class CharsInStr {

	public static void main(String[] args) {
		int count=0;
		String str="Mark";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=0) {
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}
