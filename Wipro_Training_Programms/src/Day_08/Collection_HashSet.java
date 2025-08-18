package Day_08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_HashSet {
public static void main(String[] args) {
	Set <String> names =new HashSet<String>();
	names.add("Sachin");
	names.add("Messi");
	names.add("Rohit");
	names.add("Jhon");
	names.add("Roman");
	
	System.out.println(names);
	
	Iterator<String> itr = names.iterator();
	 while(itr.hasNext()) {
			System.out.println(itr.next());
	}
}
}
