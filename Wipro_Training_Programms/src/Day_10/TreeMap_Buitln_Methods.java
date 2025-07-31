package Day_10;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Buitln_Methods {
	public static void main(String[] args) {
		Map <String, Integer> rainbow = new  TreeMap<>();
		rainbow.put("Red", 1);
		rainbow.put("Violet", 7);
		rainbow.put("Blue", 5);
		rainbow.put("Yellow", 3);
		rainbow.put("Indigo", 6);
		rainbow.put("Orange", 2);
		rainbow.put("Green", 4);
		
		System.out.println(rainbow.values());
		System.out.println(rainbow.keySet());
		
		for(Object key :rainbow.keySet()) {
			System.out.println(key + ": "+rainbow.get(key));
		}
		
		System.out.println(rainbow.isEmpty());
		System.out.println(rainbow.size());
		System.out.println(rainbow.remove("Red", 1));
	
	}

}
