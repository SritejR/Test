package newproblems;

public class Merge2SortedArryto3rdSortedArray {
	
	public static int[] merge(int[] arr1,int [] arr2) {
		
		int[] arr3=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k++]=arr1[i++];
			}else{
				arr3[k++]=arr2[j++];
			}
		}
		
		while(i<arr1.length) {
			arr3[k++]=arr1[i++];
		}
		
		while(j<arr2.length) {
			arr3[k++]=arr2[j++];
		}
		
		return arr3;
	}
	
	public static void main(String[] args) {
		
		int [] arr1= {1,5,6,7};
		int [] arr2= {2,5,8,9,11};
		
		int[] arr3=merge(arr1, arr2);
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		
		
	}

}
