package Day_08;

import java.util.HashMap;
import java.util.Map;

public class Collection_HashMap {
public static void main(String[] args) {
	Map <String, Integer>map = new HashMap<>();
	map.put("India", 5);
	map.put("England", 7);
	map.put("Germany", 7);
	map.put("Newzland", 8);
	map.put("Iran", 4);
	
	System.out.print(map.keySet());
	System.out.print(map.values());
	
	for(String key :map.keySet()) {
		System.out.println(key +": " +map.get(key));
	}
}
}
