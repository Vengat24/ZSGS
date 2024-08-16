package Exception_DAY14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class third {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = 0;
		try{
			num= obj.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
	}
	

}
