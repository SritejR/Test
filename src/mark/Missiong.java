package mark;

public class Missiong {
	
	public static int findMiss(int [] arr,int num) {
		int x1=arr[0];
		for(int i=1;i<arr.length;i++) {
			x1=x1^arr[i];
		}
		int x2=1;
		for(int i=2;i<=num+1;i++) {
			x2=x2^i;
		}
		return x1^x2;
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {2,4,1,5,3,7};//6
		
		System.out.println(findMiss(intArray, intArray.length));
	}

}
