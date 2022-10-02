package prog4_4;

public final class Square extends ClosedCurve  {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	public double computeArea() {
		return side * side;
	}
	@Override
	public double getNumberofSides() { 
		return side;
	}
	@Override
	public double computePerimeter() { 
		return 2 * (side + side);
	}


}
