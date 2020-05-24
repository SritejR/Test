package arrays;

public class Stock1 {
	//Only one traction allowed
	
	public static int makeprofit(int [] arr) {
		
		int min=Integer.MAX_VALUE;
		int max=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]-min>max) {
				max=arr[i]-min;
			}
		}
		
		return max-min;
	}
	
	
	public static void main(String[] args) {
		
		int [] intArray= {7,1,5,3,6,4};
		
		int profit=makeprofit(intArray);
		System.out.println(profit);
		
	}

}
