package ControlFlow;

public class Jump_Statements {
public static void main(String[] args) {
	//a) break – Exits the loop or switch.


	for (int i = 1; i <= 10; i++) {
	    if (i == 5) {
	        break;
	    }
	    System.out.println(i);
	}


	//b). continue – Skips the current iteration.

	for (int i = 1; i <= 5; i++) {
	    if (i == 3) {
	        continue;
	    }
	    System.out.println(i);
	}

}
}
