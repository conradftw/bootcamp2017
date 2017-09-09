import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		Triangle t = new Triangle(10.3,5.5,3.2,100.2,89.7,65.3);
		shapeList.add(t);
		t = new Triangle(10.3,5.5,3.2,100.2,89.7,48);
		shapeList.add(t);
		//Triangle t = new Triangle(1,1,2,2,3,3);
		double totalArea = 0;
		for(Shape x : shapeList) {
			totalArea += x.area();
		}

		System.out.println("The total area of our triangle is: " + totalArea);
		System.out.println(shapeList.get(0).area());

	}
}
