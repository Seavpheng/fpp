package prog4_1;

import java.util.Scanner;

import prog4_1.DeptEmployee;

public class Main {
	

	DeptEmployee[] department = null;
	
	Main(){
		Professor pro1 = new Professor("Jacky Chan", 13000, 2006, 6, 20);
		pro1.setNumberOfPublications(20);
		Professor pro2 = new Professor("Samantha Jim", 15000, 2003, 3, 1 );
		pro2.setNumberOfPublications(30);
		Professor pro3 = new Professor("Jay Lan", 12500, 2000, 2, 1);
		pro3.setNumberOfPublications(50);
		
		Secretary sec1 = new Secretary("Jimmy Smith", 8000, 2009, 11, 1);
		sec1.setOverTimeHours(100);
		Secretary sec2 = new Secretary("Samnang Sok", 7500, 2008, 10,1);
		sec2.setOverTimeHours(100);
		
		
		department = new DeptEmployee[5];
		department[0]= pro1;
		department[1]= pro2;
		department[2]= pro3;
		department[3]= sec1;
		department[4]= sec2;
		
		// for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all Department? (y/n) ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			//String info = getFormattedAccountInfo();
			// display info to console
			//System.out.print(info);
			
			printDepartmentInfo();
			
		} else {
			// do nothing..the application ends here
		}
	
	}
	
	public static void main (String[] args) 
	{
		new Main();
		 
		
	}
	
	public String printDepartmentInfo() 
	{
		String s="";
		for(DeptEmployee deptEmp : department) 
		{
			System.out.println("Name: "+	deptEmp.name + " Salary: "+deptEmp.computeSalary() );
		}
		return s;
	}
}
