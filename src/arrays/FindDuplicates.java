package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		String [] langs= {"java","go","python","java","python","c"};
		

		
		Map<String,Integer> hm=new LinkedHashMap<String,Integer>();
		for(String str:langs) {
			if(hm.containsKey(str)) {
				hm.put(str,hm.get(str)+1);
			}else {
				hm.put(str, 1);
			}
		}
		
		Set<Entry<String,Integer>> entry=hm.entrySet();
		
		for(Entry<String,Integer> ent:entry) {
			if(ent.getValue()==1) {
				System.out.println(ent.getKey());
				break;
			}
		}
		
//		entry.forEach(a->System.out.println(a));
//		java.util.Iterator<Entry<String, Integer>> itr=entry.iterator();
//		while(itr.hasNext()) {
//			if(itr.next())
//		}
		
	}

}
