package Workouts;

interface s{
	abstract void demo();
	static void de() {
		System.out.println("Interface1");
	}
	default void dem() {
		System.out.println("Interface2");
	}
}
class Shape implements s{
	public void dem() {
		System.out.println("Shape1");
	}
	protected Shape(){
		System.out.println("Shape");
	}
	void area() {
		System.out.println("Shape must have Area");
	}
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
}
class Square extends Shape{
	int a;
	Square(int a){
		this.a = a;
		System.out.println("Square");
	}
	void area() {
		System.out.println("Area of Square : " + a*a);
	}
}
class Rectangle extends Shape{
	int l;
	int w;
	Rectangle(int l,int w){
		this.l = l;
		this.w = w;
		System.out.println("Rectangle");
	}
	void area() {
		System.out.println("Area of Rectangle : " + l*w);
	}
}
public class sample2{
	public static void main(String[] args) {
		Shape s1 = new Square(10);
		Shape s2 = new Rectangle(10,20);
		s1.area();
		s2.area();
		s1.dem();
		s.de();
	}
}
