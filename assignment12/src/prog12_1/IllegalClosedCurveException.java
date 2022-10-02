package prog12_1;

public class IllegalClosedCurveException extends Exception {
	IllegalClosedCurveException(){
		super();
	}
	
	IllegalClosedCurveException(Throwable t){
		super(t);
	}
	
	IllegalClosedCurveException(String t){
		super(t);
	}
}
