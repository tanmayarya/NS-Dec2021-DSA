package OOPSImplementation;

public class Triangle extends Shape {

	public Triangle(int side) {
		super(side);
	}

	@Override
	public void area() {
		System.out.println("area 0.5 * base * height");
	}

}
