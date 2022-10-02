package assignment02;

import assignment02.Address;

public class Customer {

	private String firstName ;
	private String lastName;
	private String socSecurityNum;
	
	private Address billingAddress;
	private Address shippingAddress;
	
	public String toString()
	{
		return "["+ firstName  + ", " + lastName +", "+ socSecurityNum + "]";
	}
	
	public static Address getBillingAddress(String street, String city, String state, String zip)
	{ 	
		return new Address(street, city, state, zip);
	}
	
	public static Address getShippingAddress(String street, String city, String state, String zip)
	{
		return new Address(street, city, state, zip);
	}
	 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Customer cust01 = new Customer();
		cust01.firstName = "Seavpheng";
		cust01.lastName ="Lao";
		cust01.socSecurityNum = "SCN: 332-221-4444"; 
		cust01.billingAddress = getBillingAddress("chicago", "chicago", "chicago", "chicago"); 
		cust01.shippingAddress = getShippingAddress("washington", "washington", "washington", "washington");
		
		Customer cust02 = new Customer();
		cust02.firstName = "Khemara";
		cust02.lastName ="Nhem";
		cust02.socSecurityNum = "SCN: 332-221-4445"; 
		cust02.billingAddress =  getBillingAddress("chicago", "chicago", "chicago", "chicago"); 
		cust02.shippingAddress = getShippingAddress("washington", "washington", "washington", "washington");
		
		Customer[] lstCust = new Customer[2];
		lstCust[0] = cust01;
		lstCust[1] = cust02;
		
		for(int i= 0 ; i<lstCust.length ; i++) 
		{
			Customer obj = lstCust[i];
			
			if(obj.billingAddress.getCity().toLowerCase()== "chicago")
			{
				System.out.println(obj.toString()); 
			}
		}

	}

}
