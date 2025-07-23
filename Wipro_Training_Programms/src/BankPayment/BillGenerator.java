package BankPayment;

@FunctionalInterface
public interface BillGenerator {
		void generate(double amount);
		
		//Default method
		default void showBillFormat() {
			System.out.println("***BILL RECIPT");
		}

//static method
static void displayHeader() {
	System.out.println("Welcome to Online Billing System");
}
}