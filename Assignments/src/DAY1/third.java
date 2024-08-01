package DAY1;

public class third {
	public static void main(String[]args) {
		System.out.println("Int : ");

		int a = 35765213;
		byte a1 = (byte) a;
		short a2 = (short) a;
		long a3 = a;
		System.out.println("Int " + a +" Byte " +a1 + " Short " + a2 + " Long " + a3 );
		
		System.out.println("Short : ");
		short b = a2;
		int b1 = b;
		byte b2 = (byte) b;
		long b3 = b;
		System.out.println("Short " + b + " Int " + b1 +" Byte " +b2 + " Long " + b3 );
		
		System.out.println("Byte : ");
		byte c = b2;
		int c1 = c;
		short c2 = c;
		long c3 = c;
		System.out.println("Byte " +c + " Int  " + c1 +  " Short " + c2 + " Long " + c3 );
		
		System.out.println("Long : ");
		long d = c3;
		int d1 = (int) d;
		short d2 = (short) d;
		byte d3 = (byte) d;
		System.out.println("Long " + d + " Int " + d1 +  " Short " + d2 +" Byte " +d3  );
		
		System.out.println("Float : ");
		float e = 1234.67576f;
		double e1 = e;
		int e2 = (int) e;
		short e3 = (short) e;
		byte e4 = (byte) e;
		long e5 = (long) e;
		System.out.println("Float " +e + " Double "+e1 +" Int "+e2+" Short "+e3+" Byte "+e4+" Long "+e5);
		
		System.out.println("Double : ");
		double f = e1;
		float f1 = (float) f;
		int f2 = (int) f;
		short f3 = (short) f;
		byte f4 = (byte) f;
		long f5 = (long) f;
		System.out.println("Double "+f +" Float " +f1 +" Int "+f2+" Short "+f3+" Byte "+f4+" Long "+f5);
		
		  
	}

}
