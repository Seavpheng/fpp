package assignment02;

import reference.RandomNumbers; 

public class Prog7 {
	
	public static void Drawing() 
	{
		String output = "";
		
		int[][] arr = new int[5][4]; 
		
		for(int i = 1 ; i<5; i++) 
		{
			for(int j = 0; j<4; j++) 
			{
				arr[i][j] = RandomNumbers.getRandomInt(1, 99); 
				if(i % 2 != 0) 
				{
					output += String.format("%16d", arr[i][j]); 
				}
				else 
				{
					output += String.format("%13s %2d","+", arr[i][j]);
					
				}   
			}
			 
			output += String.format("%n");
			
			if(i % 2 == 0) {
				for(int j = 0; j<4; j++)
				{
					output += String.format("%16s", "____");
					
					if(j==3) 
					{
						output += String.format("%n %n %n %n");
					}
				} 
			} 
			   
		}
		
		System.out.println(output); 
	}
	


	
	
	public static void main(String[] args)
	{
		
		Drawing();
		
	 
//		
//		String output = "";
//		output = String.format("%16d %12d %n %n", 8, 10);
//		output += String.format("%13s %2d %9s %2d %n","+", 9, "+", 10);
//		output += String.format("%16s %12s","____", "____");
//		System.out.println(output);
	}
}
