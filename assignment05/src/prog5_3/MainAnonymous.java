package prog5_3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {
	

	
	public static void main(String [] args)
	{
		boolean ascending =true;
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		
		Arrays.sort(testStrings, new Comparator<String>() {
			public int compare(String o1, String o2) { 
				return ascending ? (o1.length() - o2.length())   :
					(o2.length() - o1.length());
			}
		});


		System.out.println(Arrays.asList(testStrings));
	}
}
