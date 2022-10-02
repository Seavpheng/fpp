package prog12_1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException {
		
		if(width <=0 || length <=0) {
			throw new IllegalClosedCurveException();
		}
		
		this.length = length;
		this.width = width;
	}
	double computeArea() {
		return width*length;
	}
	


}
