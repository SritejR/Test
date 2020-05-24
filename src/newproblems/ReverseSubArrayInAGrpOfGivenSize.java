package newproblems;

public class ReverseSubArrayInAGrpOfGivenSize {
	
	public static int[] reverse(int [] arr,int k) {
		
		for(int i=0;i<arr.length;i=i+k) {
			int start=i;
			int end=Math.min(i+k-1, arr.length-1);
			
			while(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] intArr= {5,4,3,1,2,3};
		int k=4;
		int [] res=reverse(intArr,k);
		for(Integer in:res) {
			System.out.print(in+" ");
		}
	}

}
