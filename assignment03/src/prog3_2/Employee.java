package prog3_2;

import java.time.LocalDate;

import prog3_1.AccountType;
import prog3_2.Account;

public class Employee {
	public Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public String getName(){
		return name;
	}
	
	public LocalDate getHireDate() 
	{
		LocalDate tmp = hireDate; 
		return tmp;
	}
	
	public Account getSavingsAcct() 
	{
		return savingsAcct;
	}

	public Account getCheckingAcct() 
	{
		return checkingAcct;
	}
	
	public Account getRetirementAcct() 
	{
		return retirementAcct;
	}
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		LocalDate cal = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		hireDate = cal; 
	}

	public void createNewChecking(double startAmount)
	{
		this.checkingAcct = new Account(AccountType.CHECKING, startAmount); 
	}

	public void createNewSavings(double startAmount)
	{
		// implement
		this.savingsAcct = new Account(AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) 
	{
		// implement
		this.retirementAcct = new Account(AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) 
	{
		// implement
		if (acctType == AccountType.CHECKING) 
		{
			this.checkingAcct.makeDeposit(amt);
		} 
		else if (acctType == AccountType.SAVINGS)
		{
			this.savingsAcct.makeDeposit(amt); 
		}
		else if (acctType == AccountType.RETIREMENT)
		{
			this.retirementAcct.makeDeposit(amt);
		}
	}

	public boolean withdraw(AccountType acctType, double amt) 
	{ 
		// implement
		switch (acctType) {
		case CHECKING:
			this.checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			this.savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			this.retirementAcct.makeWithdrawal(amt);
			break; 
		default:
			return false;
		}
		return true;
	}

	public String getFormattedAcctInfo() {
		// implement 
		return String.format("Account Info for %s%n%n", getName(), getHireDate());
	}

}
