 /*Scenario: A shop sells products. For each sale, we store:--Sale Item and SaleSystemOOPS2
Product name
Price
Quantity sold

We calculate:
Total cost per product
Total bill amount*/


package Day_02;

class Vehicle{
	void start() {
		System.out.println("Vehicle started");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Car driving");
	}
}
public class InheritanceOPPS4 {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive();
	}

}
