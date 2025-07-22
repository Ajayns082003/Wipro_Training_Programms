/* Empolyee Salary -Encapsulation */

package Day_02;

class Employee{
	private String name;
	private double salary;

//Using Getter and setter
public void setName(String n) {
	name =n;
		}
public void setSalary(double s) {
	salary =s;
}

public void display() {
	System.out.println("Name : "+name);
	System.out.println("Salary : "+salary);
}
}

public class EncapuslationExample {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("AJAY");
		e.setSalary(40000);
		e.display();
	}

}
