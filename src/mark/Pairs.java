package mark;

import java.util.Arrays;

public class Pairs {
	
	public static void main(String[] args) {
		
		int [] arr= {3,5,1,19,2,4,6,2,2,13};
		Arrays.sort(arr);
		int k=8;
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			if(arr[i]+arr[j]>k) {
				j--;
			}else if(arr[i]+arr[j]<k) {
				i++;
			}else {
				System.out.println(arr[i]+"&"+arr[j]);
				i++;
				j--;
			}
		}
		
	}

}
