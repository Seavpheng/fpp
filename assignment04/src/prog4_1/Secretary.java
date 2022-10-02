package prog4_1;
 

public class Secretary extends DeptEmployee
{ 
	public Secretary(String name, double salary, int hireYear, int hireMonth, int hireDay)
	{
		super(name, salary, hireYear, hireMonth, hireDay);
	}
	double overtimeHours;
	
	public double getOverTimeHours() {
		return overtimeHours;
	}
	
	public void setOverTimeHours(double overtimeHours) 
	{
		this.overtimeHours = overtimeHours;
	}
	  
	public double computeSalary()
	{
		System.out.print("Compute Salary from Secretary");
		double sum = super.salary + overtimeHours * 10;
		return sum;
	}
}
