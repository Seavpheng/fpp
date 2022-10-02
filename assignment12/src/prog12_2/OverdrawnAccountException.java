package prog12_2;

public class OverdrawnAccountException extends Exception{
	OverdrawnAccountException(){
		super();
	}
	OverdrawnAccountException(Throwable t){
		super(t);
	}
	OverdrawnAccountException(String msg){
		super(msg);
	}
}
