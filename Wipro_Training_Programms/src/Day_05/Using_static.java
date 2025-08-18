package Day_05;

interface Bank {
    void Account();

    static void Balanace() {
        System.out.println("Your Account Balance is $4000");
    }
}

class Customers implements Bank {
    public void Account() {
        System.out.println("You having a Savings Account");
    }
}

public class Using_static {
    public static void main(String[] args) {
        Customers b = new Customers();
        b.Account();
        Bank.Balanace();
    }
}

