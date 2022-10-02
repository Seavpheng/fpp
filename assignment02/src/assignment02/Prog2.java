package assignment02;

import reference.RandomNumbers; 

public class Prog2 {
	
	public static void main (String[] args) 
	{
		
		int random = RandomNumbers.getRandomInt(1, 9);
		double result1 = Math.pow(Math.PI, random);
		System.out.println("Random number is " + random + ", "
							+ "and compute for Math.Pow(" + Math.PI + ", " + random + ") = "+result1);
		
		int random2 = RandomNumbers.getRandomInt(3, 14);
		double result2 = Math.pow(random, Math.PI);
		System.out.println("Random number is " + random2 + ", "
							+ "and compute for Math.Pow(" + random2 + ", " + Math.PI + ") = "+result2);
		
		
	}

}
