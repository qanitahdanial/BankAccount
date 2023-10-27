package practice9_5;

/**
 * This is the bankaccount class.
 * To create bank account objects and constructors.
 * This class will set and get customer ID, name, balance, deposit, withdraw.
 * @author Qanitah Danial, (if multiple authors use comma.)
 */
public class Bankaccount {
	private String ID;
	private String username;
	private double balance;
	private double deposit;
	private double withdraw;
	private double accountnumber;
	/**
	 * a public static variable for interest rate.
	 * because theres one interest rate for all account, therefore its "public"
	 */
	public static double interest = 0.065;
	private static int num = 0;

	/**
	 * This is the bankaccount constructor
	 * @param initialid, the unique ID for each customer
	 * @param name, customer name
	 */
public Bankaccount(String initialid, String name)
{
	ID = initialid;
	username = name;
	balance = 0;
	accountnumber = num + 1;
	num++;
	deposit = 0;
	withdraw = 0;
}
/**
 * This is to get the unique ID back as output when we run the program.
 * @return ID.
 */
public String getId() 
{
    return ID;
}
/**
 * This is to get the unique ID back as output when we run the program.
 * @return username.
 */
public String getUsername()
{
	return username;
}
/**
 * This is to get the number of accounts bank has
 * @return account number.
 */
public double getAccountnumber()
{
	return accountnumber;
}

/**
 * to set the amount of money one wants to draw from their account.
 * This will work as ".setDeposit(amount)" infront of customer object.
 * @param w
 */
public void setWithdraw(double w)
{
	withdraw = w;
}
/**
 * to set the amount of money one wants to add to their account.
 * This will work as ".setWithdraw(amount)" infront of customer object.
 * @param d
 */

public void setDeposit(double d)
{
	deposit = d;
}
/**
 * This is to get withdrawn amount back as output when we run the program.
 * @return withdraw.
 */
public double getWithdraw() 
{
    return withdraw;
}
/**
 * This is to get added amount back as output when we run the program.
 * @return deposit.
 */
public double getDeposit() {
    return deposit;
}
/**
 * This is to get the total balance back as output when we run the program.
 * Balance depends on if the amount is added or if the amount is withdrawn.
 * @return balance.
 */
public double getBalance()
{
	 if (withdraw >= 0) 
	 { 
         balance = withdraw - balance;
     } 
	 if (deposit >= 0)
	 {
		 balance = deposit + balance;
	 }
	return balance;
}
/**
 * This is to get the number of years it will take for the balance to be doubled as output when we run the program.
 * The doubling of balance is at 0.065 interest rate compounded every year.
 * @return years.
 */
public double getDoublebalance()
{
	double doubledbalance = balance*2;
	int years = 0;
	
	while (balance < doubledbalance)
    {
        balance *= (1 + interest);
        years++;
    }
    return years;
}
}








