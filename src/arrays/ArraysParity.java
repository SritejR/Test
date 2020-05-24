package arrays;

public class ArraysParity {
	
	public static void main(String[] args) {
		
		int j=0;
		
		int [] intArray= {5,7,9,22,0,0,0,11,30};
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]<=0) {
				int temp=intArray[j];
				intArray[j++]=intArray[i];
				intArray[i]=temp;
			}
		}
		
		for(int k=0;k<intArray.length;k++) {
			System.out.print(intArray[k]+" ");
		}
		
	}

}
