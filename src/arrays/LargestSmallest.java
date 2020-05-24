package arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int [] intArray= {10,6,66,-99,3,3,-2,-18};
		int max=0;
		int min=0;
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]>max) {
				max=intArray[i];
			}
			if(intArray[i]<min) {
				min=intArray[i];
			}
			
			
		}
		
		System.out.println("MinumNumber is::"+min);
		System.out.println("MaximumNumber is::"+max);

	}

}
