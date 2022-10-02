package lab6_1;

public class Person {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Person() {
//		this.name = name;
//		this.street = street;
//		this.city = city;
//		this.state = state;
//		this.zip = zip;
		
	}
	
	public Person(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip; 
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip (String zip) 
	{
		this.zip =zip;
	}
	
	public String toString() 
	{
		return name + "\n" + street + "\n" + city +", " + state + " " + zip;  
					
	}
	

}
