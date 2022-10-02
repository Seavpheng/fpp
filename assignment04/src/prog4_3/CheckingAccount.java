package prog4_3;
 

public class CheckingAccount extends Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.00;

	public CheckingAccount(Employee e,  double startBalance){
		super(e,startBalance);
	}
	public CheckingAccount(Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		setBalance(baseBalance - MONTHLY_SERVICE_CHARGE);
	}
	public AccountType getAcctType(){
		return AccountType.CHECKING;
	}
	
 
	

}
