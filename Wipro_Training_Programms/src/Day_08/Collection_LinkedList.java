package Day_08;

import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedList {
public static void main(String[] args) {
	List<Integer> no = new LinkedList<Integer>();
	no.add(40);
	no.add(30);
	no.add(10);
	no.add(50);
	no.add(20);
	
	for(Object i : no) {
		int num =(Integer)i;
		System.out.println(num);
	}
}
}
