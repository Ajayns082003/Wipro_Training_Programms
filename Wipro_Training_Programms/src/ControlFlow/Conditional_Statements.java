package ControlFlow;

public class Conditional_Statements {
	public static void main(String[] args) {
//a)----------------------if Statement
int age = 18;
if (age >= 18) {
    System.out.println("Eligible to vote.");
}

//b)---------------------------------if-else-if Ladder 
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}

//c)------------------------ if else Statement
int number = 5;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

	}

}
