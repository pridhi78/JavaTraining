package bankDatabseApp;

public class Checking extends Account{

	//List specific properties for checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name,String SSN,double initDeposit) {
		super(name,SSN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
		//System.out.println("Account Number: "+ this.accountNumber);
		//System.out.print("New Checking account created ");
		
	}
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random() * Math.pow(10, 12));
		debitCardPin=(int)(Math.random()* Math.pow(10, 4));
		//System.out.println("CARD: "+debitCardNumber);
		//System.out.println("PIN :"+debitCardPin);
	}
	
	public void setRate() {
		//System.out.println("Implement rate for Checking");
		rate=getBaseRate()* .15;
	}
	
	//List any specific methods for checking account
	public void showInfo() {
		System.out.print(
				"Your Checking Accounts features "+
				"\nDebit Card Number "+debitCardNumber+
				"\nDebit Card Pin "+debitCardPin);
		System.out.println("\nACCOUNT TYPE: Checking");
		super.showInfo();
		
	}
	
}
