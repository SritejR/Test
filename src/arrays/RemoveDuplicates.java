package arrays;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int [] intArray= {10,6,4,2,2,1};
		
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<intArray.length;i++) {
			set.add(intArray[i]);
		}
		
		set.forEach(a->System.out.println(a));
	}

}
