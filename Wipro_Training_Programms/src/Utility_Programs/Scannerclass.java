package Utility_Programs;

import java.util.Scanner;  
public class Scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 
        System.out.println("Hello, " + name + "! Welcome to the Java program.");
        scanner.close();
    }
}
