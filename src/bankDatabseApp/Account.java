package bankDatabseApp;

//abstract ,so we cannot create object from Account class
public abstract class Account implements IRate
{
	//list common properties for savings and checking accounts
	private static int index=100;
	private String name;
	private String sSN;
	private double balance;
	
	protected String accountNumber;
	protected double rate;
	//Constructor to set base properties and initialize the account
	public Account(String name,String SSN,double initDeposit) {
		this.name=name;
		this.sSN=SSN;
		balance =initDeposit+100;
		//System.out.println(name+"  "+SSN+"  "+balance);
		
		//Set account number
		this.accountNumber=setAccountNumber();
		//System.out.println(getBaseRate());
		setRate();
		
	}
	
	private String setAccountNumber(){
		String lastTwoSSN=sSN.substring(sSN.length()-2,sSN.length());
		int UniqueID=index;
		int randomNumber=(int)(Math.random() * Math.pow(10, 3));
		return lastTwoSSN + UniqueID + randomNumber ;
	}
	
	public abstract void setRate();
	
	public void compound() {
		double accruedInterest=balance* (rate/100);
		balance=balance+accruedInterest;
		System.out.println("Accrued Interest : "+accruedInterest);
	}
	
	//List common methods
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositing "+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdrawing "+amount);
		printBalance();
	}
	
	public void transfer(String towhere,double amount) {
		balance=balance-amount;
		System.out.println("Transferring amount "+amount+" to "+towhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now Rs."+balance);
	}
	
	public void showInfo() {
		System.out.println(
				 "Name: "+name +
				 "\nAccount Number: "+accountNumber+
				 "\nSSN Number: "+sSN+
				 "\nBalance: "+ balance+
				 "\nRate : "+rate+
				 "%\n");
	}

	
	
	
}
