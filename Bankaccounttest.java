package practice9_5;

/**
 * This is the bankaccounttest class.
 * In this class we will test the methods and constructor generated in the bankaccountclass
 * We will use methods to set and get customer ID, name, balance, deposit, withdraw.
 */
public class Bankaccounttest {
/**
 * Method to create new object as "customer 1" or "customer 2"
 * Set their unique ID's and name
 * Set the amount they wanto deposit or withdraw.
 * @param args
 */
	public static void main(String[] args) {
		
		Bankaccount c1 = new Bankaccount("010ABC","Jack");
		c1.setDeposit(1000);//Setting 1000 as deposit for this account
		displayCustomerInfo(c1);
		
		Bankaccount c2 = new Bankaccount("020DEF","Jill");
		c2.setDeposit(1500); //Setting 1000 as deposit for this account
		displayCustomerInfo(c2);
		arrayPractice();
	}
	/**
	 * Method to get information printed as output
	 *This function is called twice in the main method.
	 *First for "customer 1" and then for "customer 2"
	 * @param Bankaccount
	 */
	public static void displayCustomerInfo(Bankaccount Bankaccount)
	{
		System.out.println("No. of Bank Account: " + Bankaccount.getAccountnumber());
	    System.out.println("ID: " + Bankaccount.getId());
	    System.out.println("Customer Name: " + Bankaccount.getUsername());
	    System.out.println("Balance: " + Bankaccount.getBalance());
	    System.out.println("Time it will take for the balance to be doubled: " + Bankaccount.getDoublebalance());
	    System.out.println();
	}
	/**
	 * This to create an array of 5 Account objects.
	 * Call the deposit() method to deposit some money to each account and store a random amount between 100 and 1000.
	 * Lastly calculate the average balance of 5 accounts after randomly depositing
	 */
	
	public static void arrayPractice()
	{
		Bankaccount[] allCustomers = new Bankaccount[5];
		allCustomers[0] = new Bankaccount("A001","Tom");
		allCustomers[1] = new Bankaccount("A002","Matt");
		allCustomers[2] = new Bankaccount("A003","Thomas");
		allCustomers[3] = new Bankaccount("A004","Ben");
		allCustomers[4] = new Bankaccount("A005","Jennifer");
		/**
		 * For loop to add balance to all 5 bank accounts created.
		 */
		for(int i = 0; i<5 ; i++)
		{	
			double min = 100; // Minimum value of deposit
			double max = 1000;// Maximum value of deposit
			double randomDeposit = min + (Math.random() * (max - min + 1));
			allCustomers[i].setDeposit(randomDeposit);
		}
		
		double totalBalance = 0;
		/**
		 * For loop to add balance of all 5 bank accounts created.
		 */
		for(int i = 0; i<5 ; i++)
		{
			totalBalance += allCustomers[i].getBalance();
		}
		
		double averageBalance = totalBalance / 5;

		// Print the average balance
		System.out.println("Average Balance: " + averageBalance);
	}
}
