package Banking_Systempackage;

import java.util.Scanner;
private Scanner sc;
public class Accounts {
	public Accounts(Scanner sc) {
		// TODO Auto-generated constructor stub
		this.sc=sc;
	}

public long open_account(String email) {
	System.out.println(" Enter Full Name ");
	String full_name = sc.nextLine();
	System.out.println(" Enter Initial Amount ");
	double balance = sc.nextDouble();
	System.out.println(" Enter PIN ");
	String security_pin = sc.nextLine();
	return 0;
}
public long getAccount_number(String email) {
	return 0;
}
public long generateAccountNumber(String email) {
	return 0;
}
public boolean account_exist(String email) {
	
	return false;
}


}