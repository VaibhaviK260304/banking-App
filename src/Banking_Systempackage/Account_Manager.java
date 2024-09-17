package Banking_Systempackage;

import java.util.Scanner;

public class Account_Manager {
	private Scanner sc;
	public Account_Manager(Scanner sc) {
		// TODO Auto-generated constructor stub
		this.sc=sc;
	}
	
	public void credit_money(long account_number) {
		System.out.println(" Enter Amount ");
		double balance = sc.nextDouble();
		System.out.println(" Enter PIN ");
		String security_pin = sc.nextLine();
	}
	
	public void debit_money(long account_number) {
		System.out.println(" Enter Amount ");
		double balance = sc.nextDouble();
		System.out.println(" Enter PIN ");
		String security_pin = sc.nextLine();
	}
	
	public void transfer_money(long sender_account_number) {
		System.out.println(" Enter Receiver Account Number ");
		long receiver__account_number = sc.nextLong();
		System.out.println(" Enter Amount ");
		double balance = sc.nextDouble();
		System.out.println(" Enter PIN ");
		String security_pin = sc.nextLine();
	}
	
	public void getBalance(long account_number) {
		System.out.println(" Enter PIN ");
		String security_pin = sc.nextLine();
	}
	
	


}
