package assignment02;
 
import static org.junit.Assert.*;


import org.junit.Test;

public class Prog2_8Test {

	@Test
	public void test() 
	{
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int exResult = -22;
		
		assertEquals(exResult, Prog2_8.min(arr));
	}

}
