package Banking_Systempackage;

import java.util.*;

public class Banking_App {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
		Scanner sc = new Scanner(System.in);
		User user = new User(sc);
		Account_Manager account_manager = new Account_Manager(sc);
		user.registration();
		user.login();
		
		
		

	}

}