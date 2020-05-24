package mark;

public class Stocks {
	public static int findMaxProfit(int[] arr) {
		int i=0;
		int min=0;
		int max=0;
		int maxProfit = 0;
		while(i<arr.length-1) {
			while(i<arr.length-1 && arr[i]>=arr[i+1]) {
				i++;
			}
			min=arr[i];
			while(i<arr.length-1 && arr[i+1]>=arr[i]) {
				i++;
			}
			max=arr[i];
			
			maxProfit+=max-min;
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int [] intArray= {7,1,5,3,6,4};
		int MaxProfit=findMaxProfit(intArray);
		System.out.println(MaxProfit);

	}

}
