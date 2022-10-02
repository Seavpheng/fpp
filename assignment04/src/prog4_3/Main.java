package prog4_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Employee[] emps;

	int _selectedEmp = -1;

	int _selectedAccount = -1;

	String _tranId = "";

	Scanner input;

	public static void main(String[] args) {
		new Main();
	}

	public void listEmplyee() {
		int i = 0;
		for (Employee emp : emps) {
			System.out.println((i++) + " " + emp.getName());
		}
		System.out.print("Select an employee: (type a number)"); 
		_selectedEmp = input.nextInt();  
	}
	
	private String getFormattedAccountInfo() {
        StringBuilder s = new StringBuilder();
        for (Employee e : emps) {
            s.append("ACCOUNT INFO FOR ").append(e.toString().concat("\n"));
        }
        return s.toString();
    }


	public void MakeDeposit()
	{
		Employee emp = (Employee) emps[_selectedEmp];
		System.out.print(emp.getAccountList());

		System.out.print("Select an account: (type a number)"); 
		_selectedAccount = input.nextInt(); 
		
		System.out.print("Deposit amount:  ");
		double amount = input.nextDouble(); 
		if (emp.deposit(_selectedAccount, amount)) {
			System.out.println(amount + " has been deposited in the savings account of " + emp.getName());
		} else {
			System.out.print("Invalid Transaction.");
		}
	}

	public void MakeWithdraw() 
	{
		Employee emp = (Employee) emps[_selectedEmp];
		System.out.print(emp.getAccountList());

		System.out.print("Select an account: (type a number)"); 
		_selectedAccount = input.nextInt(); 
		
		System.out.print("Withdraw amount:  "); 
		double amount = input.nextDouble(); 

		if (emp.withdraw(_selectedAccount, amount)) {
			System.out.println(amount + " has been withdraw from the savings account of " + emp.getName());
		} else {
			System.out.print("Invalid Transaction.");
		}
	 
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		// System.out.println(Arrays.toString(emps));

		do {
			System.out.println("A. See a report of all accounts.");
			System.out.println("B. Make a deposit.");
			System.out.println("C. Make a withdrawal.");
			System.out.println("Make a selection (A/B/C) or X to exit:");

			input = new Scanner(System.in);
			_tranId = input.next();

			if (_tranId.equalsIgnoreCase("B") )
			{
				listEmplyee();  
				MakeDeposit();
			} 
			else if(_tranId.equalsIgnoreCase("C")) 
			{
				listEmplyee();  
				MakeWithdraw();
			}
			else if (_tranId.equalsIgnoreCase("A"))
			{
				System.out.println(getFormattedAccountInfo());
			}
			else if(_tranId.equalsIgnoreCase("X")) 
			{
				return ;
			}
			else 
			{
				System.out.println("Invalid Command.");
			}
		} while (true);

	}

}
