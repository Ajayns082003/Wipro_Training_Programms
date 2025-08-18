package Day_08;

import java.util.Map;
import java.util.TreeMap;
public class Collection_TreeMap {


	public static void main(String[] args) {
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		m.put('A', 7);
		m.put('D', 3);
		m.put('B', 4);
		m.put('E', 1);
		m.put('C', 5);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(Object i :m.keySet()) {
		System.out.println(i +": "+m.get(i));	
		}

	}

}
