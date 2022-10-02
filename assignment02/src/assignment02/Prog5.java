package assignment02;

import java.util.Scanner;

public class Prog5 {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter N to quit"); 
		do 
		{  
			System.out.println("Input a string to reverse: "); 
			String str = scan.nextLine();
			 
			String result ="";
			
			if(str.equals("N") || str.equals("n"))
			{
				break;
			}
			else 
			{
				int index = str.length();
				 
				for(int i = index -1 ; i >= 0 ; i--) {
					
					char ch = str.charAt(i); 
					result += ch; 
				}
				
				System.out.println("Result: " + result); 
			} 
			 
		}while(true);
	} 

}
