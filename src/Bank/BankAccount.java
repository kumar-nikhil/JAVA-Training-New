package Bank;

public class BankAccount implements IInterest {
	
	//Properties of bank account
	
	
	private static int ID = 1000;
	private String accountNumber; // ID + random 2 digit number + first 2 of ssn
	private static final String routingNumber = "0004926493";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String string, double initialDeposit) {
		// TODO Auto-generated constructor stub
		//System.out.println("New Account Created");
		this.SSN = string;
		ID++;
		balance = initialDeposit; 
		//System.out.println(this.ID);
		setAccountNumber();
		
	}

	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber() {
		int random = (int) (Math.random()*100);
		//System.out.println(random);
		this.accountNumber = ID+ "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number : "+accountNumber);
	}
	
	public void setName(String string){
		
		this.name = string;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void paybill(double amount){
		balance = balance - amount;
	    System.out.println("Paying Bill "+amount);
	    showBalance();
	}
	
	public void makeDeposit(double amount){
		balance = balance + amount;
		System.out.println("Making Deposit "+amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance = " +balance);
	}



	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1+rate/100);
		showBalance();
	}
	
	@Override
	public String toString(){
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number : " + routingNumber + "]\n" + "[Balance :" + balance+ "]\n";
	}
	
}

