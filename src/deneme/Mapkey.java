package deneme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapkey {

	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap();
		map.put("Orange", 3);
		map.put("Apple", 4);
		map.put("Banan", 3);
		map.put("Orange", 5);
		map.put("Kiwi", 6);
		
		Set<String> set=map.keySet();
    for(String keyset:set) {
	
}
	}

}
