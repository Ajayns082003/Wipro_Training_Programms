package Day_05;

import java.util.Scanner;
public class AttendanceSystem01 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of students: ");
       int n = Integer.parseInt(sc.nextLine());
       String[] students = new String[n];
       String[] attendance = new String[n];
       
      
       System.out.println("\nEnter student names:");
       for (int i = 0; i < n; i++) {
           System.out.print("Student " + (i + 1) + ": ");
           students[i] = sc.nextLine();
       }
      
      
       System.out.println("\nMark attendance (P for Present, A for Absent):");
       for (int i = 0; i < n; i++) {
           System.out.print(students[i] + " (P/A): ");
           String status = sc.nextLine().trim().toUpperCase();
           attendance[i] = (status.equals("P")) ? "Present" : "Absent";
       }
      
      
       System.out.println("\nAttendance Report:");
       System.out.println("Name\t\tAttendance");
       System.out.println("---------------------------");
       for (int i = 0; i < n; i++) {
           System.out.println(students[i] + "\t\t" + attendance[i]);
       }
       System.out.println("---------------------------");
       sc.close();
   }
}

