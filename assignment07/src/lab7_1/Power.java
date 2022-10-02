package lab7_1;

public class Power {

	public double power(double x, int n) {
		if(n <= 0) {
			return 1;
		} 
		
		x =  x * power(x, n-1);
		
		return x;
	}
	
	public static void main(String[] arg) {
		double x = new Power().power(2, 10);
		
		System.out.println(x);
		 
	}
}
