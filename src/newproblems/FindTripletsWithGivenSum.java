package newproblems;

import java.util.Arrays;

public class FindTripletsWithGivenSum {
	
	public static void findTriplets(int [] arr,int sum) {
		Arrays.sort(arr);//-3,-2,-1,-1,2,3,4
		
		for(int i=0;i<arr.length;i++) {
			int start=i+1;
			int end=arr.length-1;
			while(start<end) {
				if(arr[i]+arr[start]+arr[end]==sum) {
					System.out.println(arr[i]+" "+arr[start]+" "+arr[end]);
					start++;
					end--;
				}else if(arr[i]+arr[start]+arr[end]<sum) {
					start++;
				}else {
					end--;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] intArr= {-1,4,-3,2,-1,-2,3};  //-3,-2,-1,-1,2,3,4
		int sum=0;
		findTriplets(intArr, sum);
	}

}
