package prog4_2;

import prog4_2.ClosedCurve;

public class Rectangle extends ClosedCurve {
	double width ;
	double length;
	
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
	
}
