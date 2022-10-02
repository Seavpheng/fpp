package pencil;

public class MyClass {
	public static void main(String[] args) {
		new MyClass();
	}
	
	MyClass(){
		recurse("Hello");
	}
	
	String recurse(String s) {
		if(s==null || s.equals("")) 
			return "";
		
		int r = RandomNumbers.getRandomInt();
		
		int n = s.length();
		
		//String t = "events";
		 
		//return recurse(t);
		
		if(r % 2 == 0) 
		{
			return recurse(s.substring(0, n/2));
		}
		else
		{
			return recurse(s.substring(n/2, n));
		} 	
	}
}
