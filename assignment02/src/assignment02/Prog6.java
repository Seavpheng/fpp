package assignment02;

public class Prog6 {
	
	public static String[] removeDups(String[] arr)
	{
		if(arr == null || arr.length == 0)  
			return null; 
		
		int len = arr.length;   
		 
		for(int j=0; j<len; j++) 
		{  
			for(int k=j + 1; k<len; k++ ) 
			{ 
				if(arr[j].equals(arr[k])) 
				{
					arr[k] = arr[len-1];
					len--; 
				} 
			} 
		}
		
		String[] result = new String[len]; 
		for(int x = 0; x<len ; x++) 
		{
			result[x] = arr[x];
		} 
		return result;
	}
	
	
	 
	public static boolean exitsElementAt(String element, String[] source) 
	{
		for (int i = 0; i < source.length; i++)
		{
			if (element.equals(source[i])) 
			{ 
				return true; 
			} 
		}

		return false;
	}
	
 
	
	public static void main(String [] args) 
	{
		String[] ar = removeDups(new String[] {"horse", "dog", "cat", "horse","dog"});
		
		for(int i = 0; i < ar.length ; i++) 
		{
			System.out.println(ar[i]);
		}
	}
}
