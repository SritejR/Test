package newproblems;

public class ArrayPeak {
	
	public static int findPeak(int [] arr) {
		
		int start=0;
		int end=arr.length-1;
		int mid;
		
		while(start<=end) {
			mid=(start+end)/2;
			
			if( (mid==start || arr[mid]>arr[mid-1]) && (mid==end || arr[mid]>arr[mid+1])) {
				return arr[mid];
			}else if((mid >start)&& (arr[mid-1]>arr[mid])){
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		int [] intArr= {1,5,8,2,6,8,9,3};   // 8 || 9
		System.out.println(findPeak(intArr));
	}

}
