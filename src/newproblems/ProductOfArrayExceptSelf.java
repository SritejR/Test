package newproblems;

public class ProductOfArrayExceptSelf {
	
	public static int[] newArray(int [] arr) {
		int [] newarr =new int[arr.length];
		int product=0;
		
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
		}
		
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=product/arr[i];
		}
		return newarr;
	}

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4};
		int [] arr2=newArray(arr);
		for(int k=1;k<arr2.length;k++) {
			System.out.print(arr2[k]+" ");
		}
	}

}
