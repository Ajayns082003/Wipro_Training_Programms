package Day_07;

public class BankingDemo_Mulmain {
public static void main(String[] args) throws InterruptedException{
	Bank_Mul account = new Bank_Mul(1000.0);
	Thread t1= new Thread(() -> {
		for(int i=0; i<3; i++) {
			account.deposit(300.0);
			sleep(100);
		}
	}, "Deposit-Thread");

Thread t2 = new Thread (() ->{
	for(int i=0; i< 3; i++) {
		account.withdraw(150.0);
		sleep(120);
	}
}, "Withdraw-Thread");

	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.printf("final Balance = %.2f%n", account.getBalance());
}	
	private static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException ignored) {}
	}
}
