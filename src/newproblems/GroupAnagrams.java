package newproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static List groupAnagrams(String[] strs) {
		List<List<String>> groupedAnagrams=new ArrayList<List<String>>();
		HashMap<String,List<String>> hm=new HashMap<String, List<String>>();
		for(String str:strs) {
			char[] charArr=str.toCharArray();
			Arrays.sort(charArr);
			String key=new String(charArr);
			
			if(!hm.containsKey(key)) {
				hm.put(key, new ArrayList<String>());
			}
			
			hm.get(key).add(str);
		}
		groupedAnagrams.addAll(hm.values());
			
		return groupedAnagrams;
	}
	
	public static void main(String[] args) {
		
		String[] strs= {"cat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}

}
