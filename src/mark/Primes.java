package mark;

public class Primes {
	
	public static boolean isPrime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		
		return true;
		
	}
	
	public static void main(String[] args) {
		for(int i=2;i<=25;i++) {
			if(isPrime(i)==true) {
				System.out.print(i+" ");
			}
		}
		
	}

}
