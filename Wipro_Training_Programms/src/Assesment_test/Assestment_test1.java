package Assesment_test;

public class Assestment_test1 {
public static void main(String[] args) {
	
	//Implict Type casting(Widening conversion)
	int intValue=10;
	double doubleValue =intValue; // int is implicity cat to double
	
	System.out.println("Implict Type Casting(Widening conversion");
	System.out.println("int :"+intValue);
	System.out.println("double:"+doubleValue);
	
	
	
	//Explicit type casting(Narrowing converison)
	double anotherDoubleValue =15.75;
	int anotherIntVlaue =(int) anotherDoubleValue;
	
	System.out.println("Explicit Type Casting(Narrowing conversion");
	System.out.println("double :"+anotherDoubleValue);
	System.out.println("int:"+anotherIntVlaue);
}
}
