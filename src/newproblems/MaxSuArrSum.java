package newproblems;

public class MaxSuArrSum {
	
	public static int maxSunArraySum(int [] arr) {
		int sum=arr[0];                        //20
		int maxSum=arr[0];                     //20
		                                      //1,2,-5,4,3,8,5
		for(int i=1;i<arr.length;i++) {       //
			if(sum<0) {
				sum=arr[i];
			}else {
				sum=sum+arr[i];
			}
			maxSum=Math.max(sum, maxSum);
		}
		
		return maxSum; 
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {1,2,-5,4,3,8,5};
		System.out.println(maxSunArraySum(intArray));
		
	}

}
