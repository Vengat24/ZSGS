package Day3;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner obj =  new Scanner(System.in);
		System.out.print("Enter the Num1 : ");
		num1=obj.nextInt();
		System.out.print("Enter the Num2 : ");
		num2=obj.nextInt();
		System.out.print("Enter the Num3 : ");
		num3=obj.nextInt();
		System.out.print("Greatest Number : ");
		if(num1>num2 && num1>num3)
			System.out.println(num1);
		else if(num2>num3)
			System.out.println(num2);
		else
			System.out.println(num3);	
	}
}
