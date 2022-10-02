package prog4_2;

public class Test {
	
	
	
//	public static void main(String[] args) 
//	{
//
//		ClosedCurve[] objects = {new Triangle(4,5,6),
//								 new Square(3),
//								 new Rectangle(3, 7),
//								 new Circle(3)};
//		//compute areas
//		for(ClosedCurve cc : objects) {
//			System.out.println(cc.computeArea());
//			
//		}
//    
//	}

}

public class BadInherit extends SuperClass {
    BadInherit(){
       System.out.println("In BadInherit");
    }
    public static void main(String[] args){
       new BadInherit();
    }
}
 class SuperClass {
    SuperClass(){
       System.out.println("In SuperClass");
       new BadInherit();
    }
}