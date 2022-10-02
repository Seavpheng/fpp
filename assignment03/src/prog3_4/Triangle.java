package prog3_4;

public class Triangle {

	private double base;
	private double height;
	
	public Triangle(double base, double height) 
	{
		this.base = base;
		this.height = height; 
	}
	
	public double getHeight() 
	{
		return height;
	}
	
	public double getBase() 
	{
		return base;
	}
	
	public double computeArea() 
	{
		double result = 1/2d * base * height;
		return  result;
	}
}
