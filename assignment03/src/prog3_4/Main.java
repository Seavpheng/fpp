package prog3_4;

 
import prog3_4.Circle;
import prog3_4.Rectangle;
import prog3_4.Triangle;

public class Main {
	
	public static void main(String [] args) 
	{
		Rectangle rect = new Rectangle(4, 9);
		System.out.println("Area of Rectangle is "+ rect.computeArea());
		
		Triangle tri = new Triangle (3, 35);
		System.out.println("Area of Rectangle is "+ tri.computeArea());
		
		Circle cir = new Circle(4);
		System.out.println("Area of Rectangle is "+ cir.computeArea()); 
		
		
	}

}
