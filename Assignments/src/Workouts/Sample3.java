package Workouts;

class Main {
	{
		System.out.println("static 1");
	}
	Main(){
		System.out.println("Main");
	}
	
}
class Child extends Main{
	Child(){
		super();
		System.out.println("Child.Child()");
	}
	 {
		System.out.println("static 2");
	}
}
public class Sample3 extends Child{
	{
		System.out.println("static 3");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		new Sample3();
	}

}
