package Day_07;

class Mul3 implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {	
			System.out.println("Laptop is Bigger in Size");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
}

class Mul4 implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {	
			System.out.println("Mobile is Smaller in Size");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
}

public class MultiThreading2 {
	public static void main(String[] args) {
		Runnable m1 = new Mul3();
		Runnable m2 = new Mul4();
		
		Thread t1= new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
	}

}
