package Assesment_test;

import java.util.Scanner;

public class Asssetment_test_Even_Odd {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int number = sc.nextInt();
	if(number %2 ==0) {
		System.out.println(number +" is an Even number");
	} else {
		System.out.println(number +" is  an Odd number");
	}
	}

}
