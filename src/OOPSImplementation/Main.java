package OOPSImplementation;

public class Main {
	public static void main(String[] args) {
		
//		Shape triangle = new Triangle(3);
//		triangle.area();
//		triangle.getSide();
		
//		Shape square = new Square(4);
//		square.area();
		
		
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		
		bike.start();
		bike.accelerate(100);
		bike.stop();
		
	}
}
