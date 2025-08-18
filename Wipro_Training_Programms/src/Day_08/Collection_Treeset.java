package Day_08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Collection_Treeset {
public static void main(String[] args) {
	Set <Double> s = new TreeSet<>();
	s.add(1.5d);
	s.add(3.4d);
	s.add(0.25d);
	s.add(7.25d);
	s.add(2.8d);
 System.out.println(s);
  
 Iterator<Double> it =s.iterator();
 while(it.hasNext()) {
	System.out.println(it.next());
 }
	
}
}
