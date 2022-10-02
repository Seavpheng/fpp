package assignment02;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String str, String ci, String st, String z) 
	{
		street = str;
		city = ci;
		state = st;
		zip = z;
	}
	
	public String toString() 
	{
		return street +", "+ city+", "+ state + ", " + zip;
	}
	
	public String getStreet() 
	{
		return street; 
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public String getState() 
	{
		return state;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	public void setZip (String zip) 
	{
		this.zip =zip;
	}
}
