package prog4_6_case_3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	private Person _person;
	
	PersonWithJob (String name, GregorianCalendar dob, double s){
		_person = new Person(name, dob);
		this.salary = s; 
	}
	 
 
	public double getSalary() 
	{
		return salary;
	} 

	@Override 
	public boolean equals(Object ob) { 
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		
		PersonWithJob p = (PersonWithJob)ob; 

		return  this._person.equals(p._person)  
					&& this._person.getDateOfBirth().equals(p._person.getDateOfBirth())
					&& this.getSalary() == p.getSalary();
	}
	
	public static void main(String[] args) { 
		
		PersonWithJob p1 = new PersonWithJob("Pheng", new GregorianCalendar(1986, 1, 1), 2000);
		PersonWithJob p2 = new PersonWithJob("Pheng", new GregorianCalendar(1986, 1, 1), 2000);
		
		System.out.print(p1.equals(p2));
		
		
		

	}
}
