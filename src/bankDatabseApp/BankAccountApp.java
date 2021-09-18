package bankDatabseApp;

import java.util.LinkedList;
import java.util.List;

import utilities.csv;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts=new LinkedList<Account>(); 
		
		//Read a CSV file then create new accounts based on that data
		String file="C:\\Users\\User\\eclipse-workspace\\JavaProjects\\NewBankAccounts.csv";
		List<String[]> newAccountHolders=utilities.csv.read(file);
		for (String[] accountHolder : newAccountHolders) {
			
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			
			if(accountType.equalsIgnoreCase("Savings")) {
				//System.out.println("Open a Saving Account");
				accounts.add(new Saving(name,sSN,initDeposit));
				
			}
			else if(accountType.equalsIgnoreCase("Checking")) {
				//System.out.println("Open a Checking Account");
				accounts.add(new Checking(name,sSN,initDeposit));
			}
			else {
				//System.out.println("Error reading account type");
			}
			
			/*System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);*/
		}
		
		for(Account acc :accounts) {
			System.out.println("\n*********************\n");
			acc.showInfo();
		}
		
		
				
		/*Checking check=new Checking("Tom Wilson","789654123",1500);
		Saving save=new Saving("John Rome","147852369",2500);
		// Read a CSV file then crate new accounts based on that

		save.showInfo();
		save.withdraw(300);
		save.deposit(800);
		save.transfer("Aashu", 200);
		
		save.compound();
		System.out.println("\n************************************\n");
		check.showInfo();*/
	}

}
