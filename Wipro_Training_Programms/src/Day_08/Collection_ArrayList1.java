package Day_08;

import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList1 {
	public static void main(String[] args) {
		List <Integer> l1= new ArrayList<>();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(50);
		l1.add(40);
		
		for(Object i: l1) {
			int l2 =(Integer)i;
			System.out.println(l2);
		}
	}

}
