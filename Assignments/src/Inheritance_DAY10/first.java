package Inheritance_DAY10;
/*1. Write a hierarchy of geometric shape classes 
 * 'Circle', 'Rectangle', etc inherited from a 
 * common base class 'Shape'*/
class Shape{
	int side=3;
	void getSide() {
		System.out.println("Shape has "+side +" side");
	}
}
class Circle extends Shape{
	int side = 0;
	void getSide() {
		System.out.println("Circle has "+side +" side");
	}
}
class Rectangle extends Shape{
	int side=4;
	void getSide() {
		System.out.println("Rectangle has "+side +" side");
	}
}
class Square extends Shape{
	int side=4;
	void getSide() {
		System.out.println("Square has "+side +" side");
	}
}

public class first {

	public static void main(String[] args) {
		Shape S = new Shape();
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Square s = new Square();
		S.getSide();
		c.getSide();
		r.getSide();
		s.getSide();
		
	}

}
