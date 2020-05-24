package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayByDescendingFreq {
	
	public static List<Entry<Integer, Integer>> sortByFreq(int[] arr){
//		List<Integer> al=new ArrayList<Integer>();
		
		Map<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
			
		for(int i=0;i<arr.length;i++) {
			if(lhm.containsKey(arr[i])) {
				lhm.put(arr[i], lhm.get(arr[i])+1);
			}else {
				lhm.put(arr[i],1);
			}
		}
		
		List<Entry<Integer,Integer>> ll=new LinkedList(lhm.entrySet());
		
		Collections.sort(ll,new Comparator<Entry<Integer,Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		
		return ll;
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {1,3,3,2,1,4,4,4,4,9};
		List<Entry<Integer, Integer>> ll=sortByFreq(intArray);
		ll.forEach(a->System.out.println(a));
		
	}

}
