package assignment02;

import reference.Data;

public class Prog4 {
	
	 
	public static void main(String[] agrs) 
	{
		String rawData = Data.records;
		
		String[] records = rawData.split(":");
		
		int recNum = records.length;
		
		int index = 0;
		 
		while(index < recNum) 
		{
			 
			String[] row = records[index].split(","); 
			
			System.out.println(row[0]);
			
			index++;
			
		}
		 
		
	}
}
