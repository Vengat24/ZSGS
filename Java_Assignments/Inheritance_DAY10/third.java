package Inheritance_DAY10;
//3. Create Vehicle Hierarchy

class Vehicle{
	Vehicle(){
		System.out.println("Vehicle Moves");
	}
}
class Car extends Vehicle{
	Car(){
		System.out.println("Car Moves");
	}
}
class Bike extends Vehicle{
	Bike(){
		System.out.println("Bike Moves");
	}
}
class Auto extends Vehicle{
	Auto(){
		System.out.println("Auto Moves");
	}
}

public class third {

	public static void main(String[] args) {
		Car c = new Car();
		
	}

}
