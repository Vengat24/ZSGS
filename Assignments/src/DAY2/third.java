package DAY2;
import java.util.*;
public class third {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		System.out.println("AND Operator : " + (num1&num2));
		System.out.println("OR Operator : " + (num1|num2));
		System.out.println("XOR Operator : " + (num1^num2));
		System.out.println("Left Shift Operator : " + (num1<<num2));
		System.out.println("Right Shift Operator : " + (num1>>num2));
	}

}
