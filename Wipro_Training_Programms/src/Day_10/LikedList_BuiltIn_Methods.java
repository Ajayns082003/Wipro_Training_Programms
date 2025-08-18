package Day_10;

import java.util.LinkedList;
import java.util.Collections;

public class LikedList_BuiltIn_Methods {
	public static void main(String[] args) {
		LinkedList<Integer> count = new LinkedList<Integer>();
		//Adding
		count.add(60);
		count.add(90);
		count.add(30);
		count.add(150);
		count.add(120);
		count.add(240);
		count.add(270);
		count.add(180);
		
		//Printing
		System.out.println(count);
		
		//Remove
		//1. Remove first element
		System.out.println(count.removeFirstOccurrence(60));
		System.out.println(count);
		
		//2. Remove last element
		System.out.println(count.removeLastOccurrence(270));
		System.out.println(count);
		
		//3. Remove ALL
		//System.out.println(count.removeAll(count));
		
		
		//Get elements
		System.out.println(count.getFirst());
		System.out.println(count.getLast());
		System.out.println(count.get(4));
		
		//check is item present or not
		System.out.println(count.contains(30));
		
		//check Empty or not
		System.out.println(count.isEmpty());
		
		//check size
		System.out.println(count.size());
		
		//set
		System.out.println(count.set(4, 60));
		
		//sort
		Collections.sort(count);
		System.out.println(count);
	}

}
