package DAY1;

import java.util.Scanner;

enum Day {
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
public class fourth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int ch = obj.nextInt();
		switch(ch) {
			case 1 :
				System.out.println(Day.SUNDAY);
				break;
			case 2 :
				System.out.println(Day.MONDAY);
				break;
			case 3 :
				System.out.println(Day.TUESDAY);
				break;
			case 4 :
				System.out.println(Day.WEDNESDAY);
				break;
			case 5 :
				System.out.println(Day.THURSDAY);
				break;
			case 6 :
				System.out.println(Day.FRIDAY);
				break;
			case 7 :
				System.out.println(Day.SATURDAY);
				break;
			default:
				System.out.println("Invalid ");
		}
		
	}

}
