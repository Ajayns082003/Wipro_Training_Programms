package Day_10;

import java.util.TreeSet;

public class Treeset_BuiltIn_Methods {
	public static void main(String[] args) {
		TreeSet <String> crickters = new TreeSet<String>();
		crickters.add("Sachin");
		crickters.add("Rohit");
		crickters.add("Pant");
		crickters.add("Bumrah");
		crickters.add("Surya");
		crickters.add("Raina");
		
		System.out.println(crickters);
		
		System.out.println(crickters.getFirst());
		System.out.println(crickters.getLast());
		
		System.out.println(crickters.isEmpty());
		System.out.println(crickters.remove("Pant"));
		
		System.out.println(crickters.size());
		System.out.println(crickters.subSet("Pant", true, "Surya", true));
		System.out.println(crickters.descendingSet());
		System.out.println(crickters.removeLast());
		System.out.println(crickters.removeFirst());
		System.out.println(crickters.headSet("Sachin"));
	}

}
