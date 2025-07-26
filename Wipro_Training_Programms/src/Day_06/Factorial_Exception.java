package Day_06;

import java.util.Scanner;

public class Factorial_Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number :");
            int n = scanner.nextInt();

            if (n < 0) {
                throw new IllegalArgumentException("Wrong Entry");
            }

            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);

        } 
        
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        
        catch (Exception e) {
        	
            System.out.println("Invalid input. Please enter a valid integer.");
        } 
        
        finally {
        	
            System.out.println("Program execution Done...");
            scanner.close();
        }
    }
}

