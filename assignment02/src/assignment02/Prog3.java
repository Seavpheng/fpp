package assignment02;

public class Prog3 {
	
	public static void main (String[] agrs) 
	{
		float var1 = 1.27f, var2 = 3.881f, var3 = 9.6f;
		
		int sumInt =(int)( var1 + var2 + var3);
		
		System.out.println("Casting the sum to Int : "+ sumInt);
		
		int sumIntWithRound = Math.round( var1 + var2 + var3);
		System.out.println("Rounding the sum to the nearest integer : "+ sumIntWithRound);
		
	}

}
