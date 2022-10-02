package prog3_1;

import prog3_1.Account;
import prog3_1.AccountType;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee 
{
	// instance fields
	private String name; 
	private String nickName; 
	private double salary; 
	private Date hireDay;
	
	// constructor
	public Employee(String aName, String aNickName, double aSalary, int aYear, int aMonth, int aDay)
	{
		name = aName;
		nickName = aNickName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);  
		hireDay = cal.getTime();
	}

//instance methods
	public String getName() 
	{
		return name;
	}

	public String getNickName() 
	{
		return nickName;
	}

	public void setNickName(String aNickName)
	{
		nickName = aNickName;
	}

	public double getSalary() 
	{
		return salary;
	}

	// needs to be improved
	public Date getHireDay()
	{
		return (Date)hireDay.clone();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String format = "name = %s, salary = %.2f, hireDay = %s %n";

	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
	
	
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Hea", "Meng", 1000, 2020, 10, 20); 
		
		Account accCheck = new Account( emp,  AccountType.CHECKING, 300);

		Account accSaving = new Account( emp,  AccountType.SAVINGS, 300);
		
		Account accRetirement = new Account( emp,  AccountType.RETIREMENT, 300);
		
		System.out.printf(emp.toString(), emp.name, emp.salary, emp.hireDay );
		
		System.out.println(accCheck.toString() );
		System.out.println(accSaving.toString() ); 
		System.out.println(accRetirement.toString() );
	}
}


