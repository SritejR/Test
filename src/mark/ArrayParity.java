package mark;

public class ArrayParity {
	
	public static void main(String[] args) {
		
		int [] arr= {0,9,-8,0-66,11,0,9,6,0,0};
		int j=0;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				temp=arr[j];
				arr[j++]=arr[i];
				arr[i]=temp;
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
