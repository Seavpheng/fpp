package prog4_4;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = { new Square(3),
									new Triangle(4,5,6), 
									new Rectangle(3, 4)
								 };
		//compute areas
		for(ClosedCurve cc : objects) {
			
			System.out.println("For this " + cc.getClass().getSimpleName());
			System.out.println("   Number of sides = " + cc.getNumberofSides());
			System.out.println("   Perimeter = " + cc.computePerimeter()); 
			
		}
    
	}

}