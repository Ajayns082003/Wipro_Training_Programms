/*Shape- Polymorpshim (Method Overriding*/
package Day_02;

class shape{
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends shape{
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle extends shape{
	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		shape s1 = new Circle();
		shape s2 = new Rectangle();
		s1.draw();
		s2.draw();
	}

}
