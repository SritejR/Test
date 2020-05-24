package arrays;

public class SortingArray {
	
	public static void swap(int[] arr,int i,int j) {
		if(i==j) {
			return;
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
			
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {10,6,-35,66,-99,3,3,-2,99,-18};
		
		for(int unsortedIndex=intArray.length-1;unsortedIndex>0;unsortedIndex--) {
			for(int i=0;i<unsortedIndex;i++) {
				if(intArray[i]>intArray[i+1]) {
					swap(intArray,i,i+1);
				}
			}
		}
		
		for(int j=0;j<intArray.length;j++) {
			System.out.print(intArray[j]+" ");
		}
	}

}
