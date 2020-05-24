package arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int [] intArray= {10,6,66,-99,3,3,-2,99,-18};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]>largest) {
				secondLargest=largest;
				largest=intArray[i];
			}
			
			if(intArray[i]<largest && intArray[i]>secondLargest) {
				secondLargest=intArray[i];
			}
		}
		
		System.out.println("Second Largest Element :: "+secondLargest);
	}
	

}
