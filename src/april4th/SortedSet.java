package april4th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedSet {

	public static void main(String[] args) {
		String[] arr={"a","a","a","a","a","e","d","d","c","b"};
		
			
		
		
		HashMap<String, Integer>hm =new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.get(arr[i])==null){
				hm.put(arr[i], 1);
			}
			else
				hm.put(arr[i], hm.get(arr[i])+1);
			
		}
		
		
		List<Map.Entry<String,Integer>> a=new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(a,new Comparator<Map.Entry<String,Integer>>() {


			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue()>o2.getValue())
					return 1;
				else if(o1.getValue()<o2.getValue())
					return -1;
				return 0;
			}
		});
		
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i).getKey());
		}
		
		
	}
}
