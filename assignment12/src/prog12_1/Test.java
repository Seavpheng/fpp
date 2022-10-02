package prog12_1;

public class Test {

	public static void main(String[] args) {

		Triangle triangle = null;
		Square square = null;
		Rectangle rectangle = null;
		Circle circle = null;
		try {
			triangle = new Triangle(4, 5, 6);
		} catch (IllegalTriangleException e) {
			System.out.println(e);
		}

		try {
			square = new Square(-3);
			rectangle = new Rectangle(2, 7);
			circle = new Circle(3);
		} catch (IllegalClosedCurveException e) {
			System.out.println(e);
		}

		ClosedCurve[] objects = { triangle, square, rectangle, circle };
		// compute areas
		for (ClosedCurve cc : objects) {
			if (cc != null) {
				String nameOfCurve = getClassNameNoPackage(cc.getClass());
				System.out.println("The area of this " + nameOfCurve + " is " + cc.computeArea());
			}
		}
	}

	public static String getClassNameNoPackage(Class aClass) {
		String fullClassName = aClass.getName();
		int index = fullClassName.lastIndexOf('.');
		String className = null;
		String packageName = null;

		// in this case, there is no package name
		if (index == -1) {
			return fullClassName;
		} else {
			// for other apps, may be useful to have this
			packageName = fullClassName.substring(0, index);

			className = fullClassName.substring(index + 1);
			return className;
		}

	}

}
