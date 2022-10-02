package prog4_4;

public class Rectangle extends ClosedCurve   {
	double width ;
	double length;
	
	private final double size = 4;
	
	public Rectangle(double w, double len) 
	{
		width = w;
		length = len;
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
	public double getNumberofSides() { 
		return size;
	}

	@Override
	public double computePerimeter() {
		 
		return 2* (width+length);
	}
	
}
