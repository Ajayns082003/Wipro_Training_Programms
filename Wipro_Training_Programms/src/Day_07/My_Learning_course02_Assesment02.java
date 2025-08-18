package Day_07;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class My_Learning_course02_Assesment02 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Choose a Option");
			System.out.println("1. Add student");
			System.out.println("2. Get Student Score");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the student's name: ");
				String name = sc.nextLine();
				System.out.println("Enter the student's score: ");
				int score = sc.nextInt();
				m.put(name, score);
				break;
				
			case 2:
				System.out.println("Enter the student's name to get score: ");
				String StudentName = sc.nextLine();
				System.out.println("Enter the student's score: ");
				Integer Studentscore = m.get(StudentName);
				if(Studentscore!=null) {
					System.out.println("Score for " + StudentName + " is :" +Studentscore);
				}
				else {
					System.out.println("Student not found");
				}
				break;
				
			case 3:
				System.out.println("Exiting...");
				sc.close();
				System.exit(0);
				
			default :
				System.out.println("Invalid choice, please try again later ");
			}
		}
	}

}
