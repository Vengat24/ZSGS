package Day5;

class Vehicle{
	public void start() {
		System.out.println("Vehicle Started Running...");
	}
	public void stop() {
		System.out.println("Vehicle Stopped Running...");
	}
}
class Bike extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bike Started Running...");
	}
	@Override
	public void stop() {
		System.out.println("Bike Stopped Running...");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car Started Running...");
	}
	@Override
	public void stop() {
		System.out.println("Car Stopped Running...");
	}
}
class Cycle extends Vehicle{
	@Override
	public void start() {
		System.out.println("Cycle Started Running...");
	}
	@Override
	public void stop() {
		System.out.println("Cycle Stopped Running...");
	}
}




public class second {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle v1 = new Bike();
		Vehicle v2 = new Car();
		Vehicle v3 = new Cycle();
		v.start();
		v.stop();
		v1.start();
		v1.stop();
		v2.start();
		v2.stop();
		v3.start();
		v3.stop();

	}

}
