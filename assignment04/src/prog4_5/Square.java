package prog4_5;

public final class Square extends ClosedCurve   {
	private final double side;
	
	double [] array;
	
	public Square(double side){
		this.side = side; 
		array = new double [] {this.side * 4}; 
	}
	
	public double computeArea() {
		return side * side;
	}
	  
	@Override
	public double[] getArrayOfSides() { 
		// TODO Auto-generated method stub
		return array;
	}
	 

}
