package newproblems;

import java.util.Arrays;

public class NextGreaterElem {
	
	public static int [] twoforloopmethod(int [] arr) {
		int[] output=new int[arr.length];
		Arrays.fill(output, -1);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					output[i]=arr[j];
					break;
				}
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int [] intArr= {7,8,1,4};
		int [] res=twoforloopmethod(intArr);
		for(Integer in:res) {
			System.out.print(in+" ");
		}
	}

}
