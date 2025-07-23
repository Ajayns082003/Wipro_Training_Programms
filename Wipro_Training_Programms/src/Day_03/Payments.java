//Using Abstract Class

package Day_03;

abstract class Payment2 {
	double amount;
	
	Payment2(double amount){
		this.amount =amount;
	}
	
	abstract void makePayment();
	
	void showSucessMeassage() {
		System.out.println("Payment sucessfull :" +amount);
	
	}

}

class CreditCardPayment1 extends Payment2{
	 CreditCardPayment1(double amount) {
		super(amount);
	}
	void makePayment() {
		System.out.println("Credit Card Payment Done....");
	}
}

class UpiPayment1 extends Payment2{
	UpiPayment1(double amount){
		super(amount);
	}
	void makePayment() {
		System.out.println("UPI Payment Done....");
		
	}
}

public class Payments{
	public static void main(String[] args) {
		Payment2 p1=new CreditCardPayment1(3000);
		p1.makePayment();
		System.out.println("Credit card payment process is completed");
		
		Payment2 p2=new UpiPayment1(1000);
		p2.makePayment();
		System.out.println("UPI payment process is completed");
		
	}
}
