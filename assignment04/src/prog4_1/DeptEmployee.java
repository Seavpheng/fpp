package prog4_1;

import java.time.LocalDate;

public class DeptEmployee {

	String name;
	double salary;
	LocalDate hireDay;
	
	public DeptEmployee(String name, double salary, int hireYear, int hireMonth, int hireDay) {
		this.name = name;
		this.salary =salary;
		
		LocalDate date = LocalDate.of(hireYear, hireMonth, hireDay); 
		this.hireDay = date;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public LocalDate getHireDay() 
	{ 
		return hireDay;
	}
	
	public double computeSalary() {
		return salary;
	}
}
