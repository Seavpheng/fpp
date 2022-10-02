package assignment02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog6Test {

	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveDups() 
	{
		String[] testData=new String[]{"horse", "dog", "cat", "horse","dog"}; 
		String[] result = Prog6.removeDups(testData);
		
		String[] exResult = new String[] {"horse", "dog", "cat"}; 
		
		assertEquals(exResult,  result); 
	}
	
	@Test
	public void testExist() 
	{
		String[] testData=new String[]{"horse", "dog", "cat", "horse","dog"};  
		
		String exResult = "cat"; 
		
		assertTrue(Prog6.exitsElementAt(exResult,  testData));
	}

}
