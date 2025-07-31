package Day_10;


import java.util.HashSet;
import java.util.Set;

public class HashSet_BuiltIn_Methods {
	public static void main(String[] args) {
		Set <Integer> num= new HashSet<>();
		num.add(10);
		num.add(1000);
		num.add(10000);
		num.add(100);
		num.add(10000000);
		num.add(100000);
		
		System.out.println(num);
		
		System.out.println(num.isEmpty());
		System.out.println(num.remove(10));
		System.out.println(num.size());
		System.out.println(num.hashCode());
		
	}

}
