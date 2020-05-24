package newproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindTheMajorityElementInArr {
	
	public static Integer findMajorityNumber(int[] arr) {
		Integer result=null;
		
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Integer in:arr) {
			if(!hm.containsKey(in)) {
				hm.put(in,1);
			}else {
				hm.put(in, hm.get(in)+1);
			}
		}
		int val=arr.length/2;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>val) {
				result=entry.getKey();
			}
		}


		return result;
	}
	
	public static void main(String[] args) {
		int [] intArr= {3,3,2,2,3,2,3};
		System.out.println(findMajorityNumber(intArr));
	}

}
