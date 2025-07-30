package Day_09;

import java.util.LinkedList;
import java.util.Scanner;

class User{
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username=username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}

public class My_Learning_Course2_Project_User_Authentication{
	
	private LinkedList<User> userList;
	
	public My_Learning_Course2_Project_User_Authentication() {
		userList = new LinkedList<>();
	}
	
	public void register (String username, String password) {
		User newUser =new User(username, password);
		userList.add(newUser);
		System.out.println("User Registered Successfully");
	}
	
	
	public boolean login(String username, String password) {
		for(User user:userList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
		return true;
		}
	}
		return false;
}	
	
	
	public static void main(String[] args) {
		My_Learning_Course2_Project_User_Authentication authSytem = new My_Learning_Course2_Project_User_Authentication();
		Scanner scanner = new Scanner(System.in);
		
		boolean loggedIn= false;
		while(!loggedIn) {
			System.out.println("Choose an Option");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			
			int choice =scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter a Username: ");
				String regUsername = scanner.nextLine();
				System.out.println("Enter a Password: ");
				String regPassword = scanner.nextLine();
				
				authSytem.register(regUsername, regPassword);
				break;
			
			case 2:
				System.out.println("Enter your Username: ");
				String loginUsername = scanner.nextLine();
				System.out.println("Enter your Password: ");
				String loginPassword = scanner.nextLine();
				
				if(authSytem.login(loginUsername, loginPassword)) {
				System.out.println("Login suceesfully");
				loggedIn =true;
				}
				else {
					System.out.println("Login Failed");
				}
				break;
				
			case 3:
				System.out.println("Exiting...");
				loggedIn= true;
				break; 
				
			default :
				System.out.println("Invalid choice, try again..");
			}
		}
		scanner.close();
	}
}

