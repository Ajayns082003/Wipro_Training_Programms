package Strings;

public class StringFunctiosnexample10 {
public static void main(String[] args) {

    String str = "   I am an employee of ITC   ";
    
    System.out.println("Length of the string: " + str.length());
    
    System.out.println("Character at index 5: " + str.charAt(5)); 
    
    String subStr = str.substring(3, 8); 
    System.out.println("Substring (3 to 8): " + subStr); 
   
    System.out.println("String in lowercase: " + str.toLowerCase()); 
    
    System.out.println("String in uppercase: " + str.toUpperCase());
 
    String anotherStr = "I am an employee of ITC";
    System.out.println("Strings are equal: " + str.trim().equals(anotherStr));
    
    System.out.println("Strings are equal (ignore case): " + str.equalsIgnoreCase("   i am an employee of itc   ")); 
    System.out.println("Trimmed string: '" + str.trim() + "'"); 
    
    System.out.println("Replace 'a' with 'A': " + str.replace('a', 'A'));


    System.out.println("Contains 'employee': " + str.contains("employee")); 


    System.out.println("Index of 'employee': " + str.indexOf("employee"));
    
    String[] words = str.trim().split(" ");
    System.out.println("Words in the string:");
    for (String word : words) {
        System.out.println(word);
    }
}
}