package prog4_5;

public class Rectangle extends ClosedCurve   {
	double width ;
	double length;
	
	double [] array;
	
	private final double size = 4;
	
	public Rectangle(double w, double len) 
	{
		array = new double[] {w, w, len, len}; 
		
	}
	 
	
	
	
	
	public double getWidth() 
	{
		return width;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public double getLength() 
	{
		return length;
	}
	
	public void setLength(double len)
	{
		length = len;
	}

	public double computeArea () 
	{
		return width * length;
	}
 
	@Override
	public double[] getArrayOfSides() {  
		return array;
	}

	 
}
