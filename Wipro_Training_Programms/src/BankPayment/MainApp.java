package BankPayment;

//import BankPayment.CreditCardPayment;
//import BankPayment.UpiPayment;
//import BankPayment.BillGenerator;
public class MainApp {
public static void main(String[] args) {
	CreditCardPayment ccp =new CreditCardPayment(4000);
	ccp.makePayment();
	
	UpiPayment upi = new UpiPayment(2300);
	upi.makePayment();
	
	//Interface +Lambda Demo
	BillGenerator.displayHeader(); //Static method from interface
	
	BillGenerator bill = (amount)->{
		System.out.println("Amount $" +amount);
		System.out.println("Thnank you for your payment!");
	};
	
	bill.showBillFormat(); //defalut
	bill.generate(4500); //lambda
}
}
