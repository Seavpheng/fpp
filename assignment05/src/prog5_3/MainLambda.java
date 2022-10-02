package prog5_3;

import java.util.Arrays;

public class MainLambda {
	public static void main(String[] args) {
		
		boolean ascending =false;
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		
		Arrays.sort(testStrings, (p1, p2)-> ascending ? (p1.length() - p2.length())   :
			(p2.length() - p1.length()) );
		
		System.out.println(Arrays.asList(testStrings));
		
	}
}
