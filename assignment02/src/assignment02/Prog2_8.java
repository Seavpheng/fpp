package assignment02;

import java.util.Arrays;

public class Prog2_8 {
	
	public static int min(int[] arrayOfInts) 
	{
		int tmp = arrayOfInts[0];
		for(int i = 0; i<arrayOfInts.length ; i++) 
		{
			if(tmp > arrayOfInts[i]) 
			{
				tmp = arrayOfInts[i];
			}
		}
		
		return tmp;
	}
	
	public static void main(String[] args) 
	{
		 System.out.print( min(new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22} )) ;
	}
}
