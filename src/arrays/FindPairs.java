package arrays;

import java.util.Arrays;

public class FindPairs {

	public static void main(String[] args) {
		
		int [] intArray= {1,2,6,7,3,4,5};
		Arrays.sort(intArray);
		int k=9;
		
		int low=0;
		int high=intArray.length-1;
		
		while(low<high) {
			if(intArray[low]+intArray[high]>k) {
				high--;
			}else if(intArray[low]+intArray[high]<k) {
				low++;
			}else {
				System.out.println("The pairs are "+intArray[low]+" & "+intArray[high]);
				high--;
				low++;
			}
		}
		
		
		
	}
}
