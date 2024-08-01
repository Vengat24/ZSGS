package Day4;

public class first {

	
	public static void add(long a,long b) {
		System.out.println(a+b);
	}
	public static void subtract(long a,long b) {
		System.out.println(a-b);
	}
	public static void multiply(long a,long b) {
		System.out.println(a*b);
	}
	public static void divide(long a,long b) {
		System.out.println(a/b);
	}
	public static void add(float a,float b) {
		System.out.println(a+b);
	}
	public static void subtract(float a,float b) {
		System.out.println(a-b);
	}
	public static void multiply(float a,float b) {
		System.out.println(a*b);
	}
	public static void divide(float a,float b) {
		System.out.println(a/b);
	}
	public static void add(double a,double b) {
		System.out.println(a+b);
	}
	public static void subtract(double a,double b) {
		System.out.println(a-b);
	}
	public static void multiply(double a,double b) {
		System.out.println(a*b);
	}
	public static void divide(double a,double b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		System.out.println();
		add(10,20);
		subtract(10,20);
		multiply(10,20);
		divide(20,10);
		
		add((short)10,(short)20);
		subtract((short)10,(short)20);
		multiply((short)10,(short)20);
		divide((short)20,(short)10);
		
		add((byte)10,(byte)20);
		subtract((byte)10,(byte)20);
		multiply((byte)10,(byte)20);
		divide((byte)20,(byte)10);
		
		add((long)10,(long)20);
		subtract((long)10,(long)20);
		multiply((long)10,(long)20);
		divide((long)20,(long)10);
		
		add(10.23453532523363426632694326934262394632499439734234,20.35774634463);
		subtract(10.1,20.2);
		multiply(10.2,20.5);
		divide(20.2,10.1);
		
		add(10.266555578558586f,20.3243344244533f);
		subtract(10.1f,20.2f);
		multiply(10.2f,20.5f);
		divide(20.2f,10.1f);
	}

}
