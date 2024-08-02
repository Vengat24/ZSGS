package Day6;

public class second {

	static int a;
	static int b;
	static {
		a=20;
		b=10;
	}
	public static void add() {
		System.out.println(a+b);
	}
	public static void sub() {
		System.out.println(a-b);
	}
	public static void mul() {
		System.out.println(a*b);
	}
	public static void div() {
		System.out.println(a/b);
	}
	public static void mod() {
		System.out.println(a%b);
	}
	
	
	public static void main(String[] args) {

		add();
		sub();
		mul();
		div();
		mod();
	}

}
