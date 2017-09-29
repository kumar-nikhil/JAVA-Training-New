package Bank;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("23454324", 1000.50);
		//BankAccount acc2 = new BankAccount("23532245");
		//BankAccount acc3 = new BankAccount("23562974");
		
		acc1.setName("joe");
		System.out.println(acc1.getName());
		acc1.makeDeposit(1000);
		acc1.makeDeposit(2000);
		//acc1.showBalance();
		acc1.paybill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}
	
	

}
