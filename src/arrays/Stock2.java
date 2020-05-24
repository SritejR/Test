package arrays;

public class Stock2 {
	
	public static int maxProfit(int [] arr) {
		int i=0;
		int low=0;
		int high=0;
		int maxProfit=0;
		
		while(i<arr.length-1) {
			while(i<arr.length-1 && arr[i]>=arr[i+1]) {
				i++;
			}
			low=arr[i];
			
			while(i<arr.length-1 && arr[i+1]>=arr[i]) {
				i++;
			}
			high=arr[i];
			
			maxProfit+=high-low;
		}
		
		
		
		
		return maxProfit;
		
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {7,1,5,3,6,4};
		
		int profit=maxProfit(intArray);
		System.out.println(profit);
		
		
	}

}
