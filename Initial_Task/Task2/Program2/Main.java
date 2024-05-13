import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner obj =  new Scanner(System.in);
	    int Num1 = obj.nextInt();
	    int Num2 = obj.nextInt();
	    System.out.println("Binary Rep of " + (Num1) + ": " +( Integer.toBinaryString(Num1)));
	    System.out.println("Binary Rep of " + (Num2) + ": " +( Integer.toBinaryString(Num2)));
		System.out.println("Bitwise And Operator & : "  + (Num1&Num2) + " -> " + (Integer.toBinaryString(Num1&Num2)) );
		System.out.println("Bitwise Or Operator | : "  + (Num1|Num2) + " -> " + (Integer.toBinaryString(Num1|Num2)));
		System.out.println("Bitwise Not Operator ~ : "  + (~Num1) + " -> " + (Integer.toBinaryString(~Num1)));
		System.out.println("Bitwise Xor Operator ^ : "  + (Num1^Num2) + " -> " + (Integer.toBinaryString(Num1^Num2)));
		System.out.println("Bitwise Leftshift Operator << : "  + (Num1<<Num2) + " -> " + (Integer.toBinaryString(Num1<<Num2)));
		System.out.println("Bitwise Rightshift Operator >> : "  + (Num1>>Num2) + " -> " + (Integer.toBinaryString(Num1>>Num2)));
	}
}
