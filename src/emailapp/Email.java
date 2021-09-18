package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="aeycompany.com";

	//Constructor to receive the first name and last name
	public Email (String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Email Created :"+ this.firstname+" "+this.lastname);
		
		//Call a method asking for the department -return the department
		this.department=setDepartment();
		System.out.println("Department "+this.department);
		
		//Call a method that returns a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("YOUR PASSWORD IS : "+ this.password);
		
		//Combine elements to generate email
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
		System.out.println("Your Email is :"+email);
	}

	//Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for Accounting \n0 for more\nEnter department Code:");
		Scanner sc=new Scanner(System.in);
		int depChoice=sc.nextInt();
		if(depChoice==1) {
			return "Sales";
		}
		else if(depChoice==2) {
			return "Development";
		}
		else if(depChoice==3) {
			return "Accounting";
		}
		else
			return "";
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123!#";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//Set mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME : "+firstname+" "+lastname+
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY: "+mailboxCapacity + "mb";
	}
}
