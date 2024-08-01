package Day3;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter the Number : ");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		for(int i=1;i<=20;i++) {
			System.out.println(num + " * " + i + " = "+ num*i);
		}
		

	}

}
