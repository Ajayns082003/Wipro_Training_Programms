//Interface another example

package Day_04;

abstract class Vehicle{
	abstract void speed();
	abstract void brand();
}

class Car extends Vehicle{
	 void speed() {
		System.out.println("Speed of the car : 4Km/hr") ;
	}
	 void brand() {
		 System.out.println("brand is audi");
	 }
}

public class Vehicle_main {
public static void main(String[] args) {
	Vehicle v1 = new Car();
	v1.speed();
	v1.brand();
	
	System.out.println();
	v1.speed();
	v1.brand();
}
}
