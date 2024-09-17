package Banking_Systempackage;

import java.util.Scanner;

public class User {
private Scanner sc;
	public User(Scanner sc) {
		// TODO Auto-generated constructor stub
		this.sc=sc;
	}
	public void registration() {
		System.out.println("This is registration process");
		System.out.println(" Enter Full Name ");
		String full_name = sc.nextLine();
		System.out.println(" Enter E-mail ");
		String email = sc.nextLine();
		System.out.println(" Enter Password ");
		String password = sc.nextLine();
		if(user_exist(email)) {
			System.out.println(" User Already Exists ");
			return;
		}
	}
	public boolean user_exist(String email) {
		
		return false;
	}
	public String login() {
		System.out.println(" Enter your E-mail Id ");
		String email = sc.nextLine();
		System.out.println(" Enter your password ");
		String password = sc.nextLine();
		return null;
	}
	
}




