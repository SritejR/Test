package mark;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayByDscFreq {
	
	public static List<Entry<Integer,Integer>> sorfByFreq(int [] arr){
		
		Map<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
		for(Integer in:arr) {
			if(lhm.containsKey(in)) {
				lhm.put(in,lhm.get(in)+1);
			}else {
				lhm.put(in,1);
			}
		}
		List<Entry<Integer,Integer>> ll=new LinkedList(lhm.entrySet());
		Collections.sort(ll,new Comparator<Entry<Integer,Integer>>(){

			public int compare(Entry<Integer,Integer> o1,Entry<Integer,Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());	
				
			}
			
			
		});
		return ll;
		
	}
	
	public static void main(String[] args) {
		
		int [] intArray= {1,3,3,2,1,4,4,4,4,9};
		List<Entry<Integer,Integer>> ll=sorfByFreq(intArray);
		ll.forEach(o->System.out.println(o));
		
	}

}
