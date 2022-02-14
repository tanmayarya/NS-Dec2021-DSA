package OOPSImplementation;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start bike engine");
	}

	@Override
	public void stop() {
		System.out.println("Stop bike engine");
	}

	@Override
	public void accelerate(int speed) {
		System.out.println("speed up the bike by + " + speed);
	}

	@Override
	public void brake() {
		System.out.println("speed down the bike");
	}

}
