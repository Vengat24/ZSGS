package DAY2;
import java.util.*;

public class first {

	public static void main(String[] args) {
		int FREEZ_POINT	= 32;
		float DIFF = 1.8f;
		Scanner obj = new Scanner(System.in);
		System.out.print(" Enter the Celsius : ");
		int C = obj.nextInt();
		float F = (DIFF * C) + FREEZ_POINT;
		System.out.println(" Fahrenheit : " + F);
	}

}

