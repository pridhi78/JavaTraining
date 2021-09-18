package bankDatabseApp;

public class Saving extends Account{
	
	//Properties specific to saving accounts
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize the settings for the saving properties
	public Saving(String name,String SSN,double initDeposit) {
		super(name,SSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
		//System.out.println("Account Number: "+ this.accountNumber);
		//System.out.println("New Saving account created ");		
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxId=(int) (Math.random() * Math.pow(10, 3));
		//System.out.println(safetyDepositBoxId);
		safetyDepositBoxKey=(int) (Math.random() * Math.pow(10, 4));
	}
	//List any method specific to saving account

	public void showInfo() {
		
		
		System.out.print(
				"Your Saving Accounts features "+
				"\nSafety Deposit Id "+safetyDepositBoxId+
				"\nSafety Deposit Box Key "+safetyDepositBoxKey);
		System.out.println("\nACCOUNT TYPE: Saving");
		super.showInfo();
		
	}

	@Override
	public void setRate() {
		//System.out.println("Implement rate for Savings");
		rate=getBaseRate()- .25;
		
	}
}
