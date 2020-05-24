package mark;

public class Facto {
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}
		return num*(fact(num-1));
	}
	
	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
		
		System.out.println(fact(5));
	}

}
