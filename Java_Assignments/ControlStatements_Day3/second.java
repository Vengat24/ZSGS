package Day3;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		int mark;
		System.out.print("Enter the Mark : ");
		Scanner obj = new Scanner(System.in);
		mark = obj.nextInt();
		if(mark > 100) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
			
		else
			mark =  mark/10;
		
		switch(mark) {
			case 10:
				System.out.println("Grade A");
				break;
			case 9:
			case 8:
				System.out.println("Grade B");
				break;
			case 7:
			case 6:
				System.out.println("Grade C");
				break;
			case 5:
				System.out.println("Grade D");
				break;
			default : 
				System.out.println("Fail");
		}

	}

}
