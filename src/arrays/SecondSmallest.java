package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int [] intArray= {10,6,-35,66,-99,3,3,-2,99,-18};
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]<smallest) {
				secondSmallest=smallest;
				smallest=intArray[i];
			}
			
			if(intArray[i]>smallest && intArray[i]<secondSmallest) {
				secondSmallest=intArray[i];
			}
		}
		System.out.println("Second Smallest Element :: "+secondSmallest);
	}
}
