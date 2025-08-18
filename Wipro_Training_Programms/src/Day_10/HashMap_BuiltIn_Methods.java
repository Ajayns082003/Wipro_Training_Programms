package Day_10;

import java.util.HashMap;
import java.util.Map;

public class HashMap_BuiltIn_Methods {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//Adding
		map.put("Dairy Milk", 100);
		map.put("Kit Kat", 50);
		map.put("Five Star", 15);
		map.put("Milky Bar", 20);
		map.put("Nuts", 30);
		
		

		//Access item through loops
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		for(Object k:map.keySet()) {
			System.out.println(k+": "+map.get(k));
		}
		
		//remove a item
		System.out.println(map.remove("Nuts"));
		
		//Clear 
		//System.out.println(map.clear());
		
		//check size
		System.out.println(map.size());
		
		
		//Accessing through only keys
		for(String i :map.keySet()) {
			System.out.println(i);
		}
		
		//Accessing through only values
		for(Integer i :map.values()) {
			System.out.println(i);
			
			
		}
		//Check is HashMap is empty or not - Boolean return
		System.out.println(map.isEmpty());
		
		
		//Replace old value to new value using Replace
		System.out.println(map.replace("Five Star", 15, 25));
	}

}
