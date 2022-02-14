package OOPSImplementation;

public interface Vehicle {
	int MAX_SPEED = 200;
	
	void start();
	void stop();
	void accelerate(int speed);
	void brake();
}
