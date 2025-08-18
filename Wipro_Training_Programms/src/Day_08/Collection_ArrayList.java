package Day_08;

import java.util.ArrayList;

public class Collection_ArrayList {
	public static void main(String[] args) {
		// creating Arraylist
		ArrayList<String> fruits = new ArrayList<>();
		
		//Adding items
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		System.out.println(fruits);
		
		// Accessing ArrayList elements
		System.out.println(fruits.get(3));
		
		//Change items 
		System.out.println(fruits.set(3, "Dragon fruit"));
		
		//Remove and clear items
		System.out.println(fruits.remove(1));
		//System.out.println(fruits.clear());
		
		//Size
		System.out.println(fruits.size());
		
		//Using Loops
		for(String i :fruits) {
			System.out.println(i);
		}
	}

}
