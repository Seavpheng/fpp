package lab6_2;

public class Util {
	
	public int countLetter(String str) {
		return str.length();
	}
	
	public String reverseLetter(String str) {
		String result = "";
		for(int i = str.length() - 1; i>=0; i--) 
		{
			result += str.charAt(i);
		}
		return result;
	}
	
	public String removeDuplicates(String str) 
	{
		String result = "";
		for(int i=0; i<str.length(); ++i) {
			boolean dupFound = false;
			for(int j = 0; j < i; ++j) {
				if(str.charAt(j)==(str.charAt(i))) {
					dupFound = true;
					break;
				}
			}
			if(!dupFound) {
				result += str.charAt(i);
			}
		}
		
		return result; 
	}
}
