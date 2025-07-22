package Day_02;

class Student{
	String name;
	int age;
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
public class StudentTest {
	public static void main(String[] args) {
		Student s= new Student();
		s.name ="Ajay-Wipro";
		s.age=22;
		s.display();
		
	}

}
