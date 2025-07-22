package ControlFlow;

public class Looping_Statements {
public static void main(String[] args) {
	//a.for Loop
	
	for (int i = 1; i <= 5; i++) {
	    System.out.println("i = " + i);
	}

	//b. while Loop


	int i = 1;
	while (i <= 5) {
	    System.out.println("i = " + i);
	    i++;
	}

	//c. do-while Loop - Executes at least once even if the condition is false.

	int j = 1;
	do {
	    System.out.println("j = " + j);
	    j++;
	} while (j <= 5);


}
}
