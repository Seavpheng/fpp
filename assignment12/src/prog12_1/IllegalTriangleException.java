package prog12_1;

public class IllegalTriangleException extends IllegalClosedCurveException {
	
	IllegalTriangleException(){
		super();
	}
	
	IllegalTriangleException(Throwable t){
		super(t);
	}
	
	IllegalTriangleException(String t){
		super(t);
	}
}
