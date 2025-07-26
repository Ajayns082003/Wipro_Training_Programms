package Day_06;

import java.util.Scanner;

public class Array_Expection_Using_Scanner {
    public static void main(String[] args) {
        int[] numbers = new int[5]; 
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index : ");
            int index = scanner.nextInt();
            numbers[index] = 100;
            System.out.println("Successfully assigned 100 to index " + index);
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Index value should be from 0 to 4.");
        } 
        
        catch (Exception e) {
            System.out.println("Please enter an integer.");
        } 
        finally {
            System.out.println("Program execution Done...");
            scanner.close();
        }
    }
}

