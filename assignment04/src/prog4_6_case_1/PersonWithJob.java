package prog4_6_case_1;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person{
	private double salary;
	
	PersonWithJob (String n, GregorianCalendar dob, double s){
		super(n, dob);
		this.salary =s; 
	}
	
	public double getSalary() 
	{
		return salary;
	}
	

	@Override 
	public boolean equals(Object ob) {
		System.out.print(this.getName());
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return this.getName().equals(p.getName()) && this.getDateOfBirth().equals(p.getDateOfBirth());
	}
	
	public static void main(String[] args) { 
		
		PersonWithJob p1 = new PersonWithJob("Pheng", new GregorianCalendar(1986, 1, 1), 1000);
		PersonWithJob p2 = new PersonWithJob("Younes", new GregorianCalendar(1986, 1, 1), 2000);
		
		System.out.print(p1.equals(p2));
		
		
		

	}
}
