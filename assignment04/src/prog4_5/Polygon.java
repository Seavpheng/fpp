package prog4_5;

public interface Polygon {  
	
	abstract double[] getArrayOfSides();
	
	 default double computePerimeter(double[] arr) 
	{
		double sum = 0;
		for(double a:arr) 
			sum+=a; 
		
		return sum;
	}
	 
	

}
