package arrays;



public class MissingElementInArray {
	
	public static int missingNum(int [] arr,int len) {
		
		int x1=arr[0];
		int x2=0;
		
		for(int i=1;i<arr.length;i++) {
			x1=x1^arr[i];
		}
		
		for(int i=1;i<=len+1;i++) {
			x2=x2^i;
		}
		
		return x1^x2;
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {1,5,3,2,4};
		int res=missingNum(intArray, 5);
		System.out.println("Missing Number is ::"+res);
	}

}
