package newproblems;

import java.util.Arrays;

public class MinimumLengthUnSorted {
	
	public static int minimumUnsortedLength(int[] arr) {
		
		int[] nums=new int[arr.length];
		nums=arr.clone();
		Arrays.sort(nums);
		int max=0;
		int min=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=nums[i]) {
			min=Math.min(i, min);
			max=Math.max(i, max);
			}
		}
		
		return max-min+1;
	}
	
	public static void main(String[] args) {
		
		int [] intArr= {1,5,3,7,2,9};
		System.out.println(minimumUnsortedLength(intArr));
		
		
	}

}
