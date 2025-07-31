package Day_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollection2 {
	public static void main(String[] args) {
		
	//LIST
	ArrayList<String> courses = new ArrayList<>();
	courses.add("java");
	courses.add("python");
	courses.add("data structures");
	courses.add("java");
	for(String c : courses)
	{
	System.out.println(c);
	}
	
	//SET
	Set <Integer> Courses = new HashSet<>();
	Courses.add(101);
	Courses.add(102);
	Courses.add(101);
	Courses.add(104);
	for(Integer j : Courses)
	{
		System.out.println(j);
	}
	
	
	//MAP
	Map<String, Integer> courseduration = new HashMap<>();
	courseduration.put("Kannada", 101);
	courseduration.put("English", 102);
	courseduration.put("Maths", 101);
	courseduration.put("Englsih", 104);
	courseduration.put("Science", 105);
	for(String c :courseduration.keySet()) {
		System.out.println(c + "=" + courseduration.get(c));
				
	}
	
   }
}





