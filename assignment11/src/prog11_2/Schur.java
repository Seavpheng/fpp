package prog11_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Schur {

	
	boolean checkForSum(List<Integer>list, Integer z) 
	{
		var h =new HashMap<Integer, Integer>(); 
		for(Integer i : list) {
			h.put(i, i);
		} 
		
		for(Integer i : list) {
			int tmp = z - i;
			
			if(h.containsValue(tmp) && i != tmp) {
				return true;
			}
		}
		
		return false; 
	}
	
	public static void main(String [] args) {
		Schur schur = new Schur();
		List<Integer> in = Arrays.asList(1, 2, 4);; 
		
		boolean bln = schur.checkForSum(in ,6); 
		System.out.print(bln);
	}
}
