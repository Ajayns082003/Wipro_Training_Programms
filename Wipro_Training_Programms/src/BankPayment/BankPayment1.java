package BankPayment;

public abstract class BankPayment1 {
    protected double amount;

    public BankPayment1(double amount) {
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Payment of ₹" + amount + " processed.");
    }

    public abstract void makePayment();  // abstract method
}

 class CreditCardPayment extends BankPayment1 {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing Credit Card Payment...");
        printReceipt();
    }
}


  class UpiPayment extends BankPayment1 {
    public UpiPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing UPI Payment...");
        printReceipt();
    }
}

