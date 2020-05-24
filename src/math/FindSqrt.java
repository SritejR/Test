package math;

public class FindSqrt {
	public static int findSqrt(int num) {
		
		if(num<2) {
			return num;
		}
		
		int p=1;
		while(p*p<num) {
			p++;
		}
		
		return p-1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(findSqrt(17));
		
	}

}
