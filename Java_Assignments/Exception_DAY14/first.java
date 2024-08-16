package Exception_DAY14;

import java.util.Scanner;

/*1. Write a program for division with proper 
 *divide-by-zero exception handling*/
public class first {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Dividend : ");
		int dividend = obj.nextInt();
		System.out.print("Divisor : ");
		int divisor = obj.nextInt();
		int result;
		try {
			result = dividend/divisor;
		}catch(ArithmeticException e) {
			result = 0;
		}
		System.out.println("Result : "+result);
	}
}
