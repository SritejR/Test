package math;

public class FactorialRec {
	
	public static int factorail(int num) {
		if(num==0) {
			return 1;
		}
		
		return num*factorail(num-1);
	}
	
	public static void main(String[] args) {
		
		int res=factorail(5);
		System.out.println(res);
	}

}
