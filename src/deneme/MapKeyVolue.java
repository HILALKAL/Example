package deneme;

import java.util.*;

public class MapKeyVolue {

	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap();
		map.put("Orange", 3);
		map.put("Apple", 4);
		map.put("Banan", 3);
		map.put("Orange", 5);
		map.put("Kiwi", 6);
		
	
		
		
		Set<Map.Entry<String, Integer>> fruitSet=map.entrySet();
		
		for(Map.Entry<String, Integer> entryfruit:map.entrySet()) {//fruitSet
			
			String str=entryfruit.getKey()+":"+entryfruit.getValue();
			System.out.println(str);
		}
		Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,Integer> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		

	}

}
