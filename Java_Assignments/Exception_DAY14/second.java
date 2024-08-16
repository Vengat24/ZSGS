package Exception_DAY14;


class ClassTypeException extends Exception {
	ClassTypeException(){
		System.out.print("Exception : ");
	}
}
class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
public class second {
	public static void main(String[] args) {
	try {
		user();
	}catch(ClassTypeException e) {
		System.out.println("ClassTypeException");
	}
	}
	public static void user() throws ClassTypeException{
		try {
			A a = new B();
			C c = (C)a;	
		}catch(ClassCastException e) {
			throw new ClassTypeException();
		}
	}
}
