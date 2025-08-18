package Day_05;

interface Netflix {
    void Series();
    default void Watch() {
        System.out.println("Watch Stranger Things 5");
    }
}

class St5 implements Netflix {
public void Series() {
	// TODO Auto-generated method stub
	System.out.println("Go to Netflix");
}  
}

public class Using_default {
    public static void main(String[] args) {
        St5 s = new St5();
        s.Series();
        s.Watch();
    }
}
