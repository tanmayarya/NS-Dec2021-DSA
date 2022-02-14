package OOPSImplementation;

public abstract class Shape {
	
	private int side;
	
	public Shape(int side) {
		this.side = side;
	}
	
	public abstract void area();
	
	// getter of side
	public int getSide() {
		return this.side;
	}
	
	// setter of side
	public void setSide(int side) {
		 this.side = side;
	}
}
