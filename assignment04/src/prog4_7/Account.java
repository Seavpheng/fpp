package prog4_7;

abstract public class Account implements Comparable<Account> {
	private Employee emp;
	private double balance;
	abstract public AccountType getAcctType();


	@Override
	public int compareTo(Account a) {
		return Double.compare(a.getBalance(), this.getBalance());
	}
	
	Account(Employee e, double startBalance) {
		emp = e;
		balance = startBalance; 
	}
	
	Account(Employee e) {
		this(e,0.0);
	}

	void makeDeposit(double amount){
		balance += amount;
	}
	boolean makeWithdrawal(double amount){
		if(amount > balance){
			return false;
		}
		balance -= amount;
		return true;
	}
	double getBalance(){
		return balance;
	}
	/** used by subclasses only */
	void setBalance(double bal){
		balance = bal;
	}
	void updateBalance() {
		//by default do nothing
	}
	
	
	public Employee getEmp(){
		return emp;
	}
	private String newline = System.getProperty("line.separator");
	public String toString(){
		String ret =
			"Account type: "+getAcctType().toString().toLowerCase()+newline+
			"Current bal:  "+balance;
		return ret;
	}
	
}
