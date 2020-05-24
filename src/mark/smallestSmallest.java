package mark;

public class smallestSmallest {

	public static void main(String[] args) {
		int[] arr= {1,2,-6,44,7,99,-3,4,0,5,-27};
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondsmallest=smallest;
				smallest=arr[i];
			}
			if(arr[i]<smallest && arr[i]>secondsmallest) {
				secondsmallest=arr[i];
			}
		}
		
		System.out.println("smallest element is::"+smallest);
		System.out.println("Secondsmallest element is::"+secondsmallest);
	}

}
