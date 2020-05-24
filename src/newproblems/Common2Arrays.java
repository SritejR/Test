package newproblems;

public class Common2Arrays {

	public static void common(int []arr1,int[] arr2) {
			int x=0;
			int y=0;
			
			
			while(x<arr1.length && y<arr2.length) {
				if(arr1[x]==arr2[y]) {
					System.out.println(arr1[x]);
					x++;
					y++;
					
				}else if(arr1[x]>arr2[y]) {
					y++;
				
				}else {
					x++;
				}
			}
		}
		
		public static void main(String[] args) {
			int [] arr1= {1,5,10,20,40,80};
			int [] arr2= {6,7,20,80,100};

			common(arr1,arr2);
		}

	}


