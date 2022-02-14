package OOPSImplementation;

public class Square extends Shape {

	public Square(int side) {
		super(side);
	}

	@Override
	public void area() {
		System.out.println("area is side * side");
	}

}
