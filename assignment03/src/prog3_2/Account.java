package prog3_2;

import prog3_1.AccountType;
import prog3_2.Employee;

public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public AccountType getAccountType()
	{
		return acctType;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	Account(AccountType acctType, double balance) { 
		this.acctType = acctType;
		this.balance = balance;
	} 
	
	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	} 
	
	Account(Employee emp, AccountType acctType)
	{
		this(emp, acctType, DEFAULT_BALANCE);
	}
 
	public String toString() 
	{
		String s = String.format("Account type:     %s%n", getAccountType());	 
		s+= String.format("Account Balance:  %s%n", getBalance( ));	
		
		return s;
	}
	
	public void makeDeposit(double deposit)
	{ 
		// implement
		
		balance += deposit;
		
	}

	public boolean makeWithdrawal(double amount)
	{
		// implement
		if(balance - amount < 0)  
		{
			return false;
		}
		
		balance -= amount;
		
		return true;
	}
}
