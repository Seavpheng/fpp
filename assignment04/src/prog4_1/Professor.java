package prog4_1;

public class Professor extends DeptEmployee 
{
	public Professor(String name, double salary, int hireYear, int hireMonth, int hireDay)
	{
		super(name, salary, hireYear, hireMonth, hireDay);
		// TODO Auto-generated constructor stub
	}

	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	
	
	
	
	
	
}
