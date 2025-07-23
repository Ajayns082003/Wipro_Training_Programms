package Day_03;

interface EcomarcesPaymnet{
	void makePayment();
}

abstract class PaymentSystems implements EcomarcesPaymnet{
	double amount;
	
	public PaymentSystems(double amount) {
		this.amount =amount;
	}
	void showSuccessMessage() {
		System.out.println("Payment is Sucessfull :" +amount);
	}
}
	
class DebitCardPayment3 extends PaymentSystems{
	 DebitCardPayment3(double amount) {
		super(amount);
}
	public void makePayment() {
		System.out.println("Debit Card Payment is Done....");
		showSuccessMessage();
	}
}

class NetBanking extends PaymentSystems{
	 NetBanking(double amount) {
		super(amount);
}
	public void makePayment() {
		System.out.println("Net Banking Payment is Done....");
		showSuccessMessage();
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		
		PaymentSystems ep = new DebitCardPayment3(2300);
		ep.makePayment();
		
		System.out.println();
		
		PaymentSystems ep2 =new NetBanking(2100);
		ep2.makePayment();
		}
}
