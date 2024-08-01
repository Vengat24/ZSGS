package Day7;

import java.util.Scanner;

public class forth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = obj.next();
		if(input.contains("@")) {
			if(input.charAt(input.indexOf("@")+1) !='.')
				{
				System.out.println("Valid Email");
				System.exit(0);
				}else {
					System.out.println("Invalid Email");
					System.exit(0);
				}
		}else {
			System.out.println("Invalid Email");
			System.exit(0);
		}
		if(input.length()>=4 &&input.substring(input.length()-4).equals(".com") ){
			System.out.println("Valid Email");
		}else if(input.length()>=3 && input.substring(input.length()-4).equals(".in")) {
			System.out.println("Valid Email");
		}else {
			System.out.println("Invalid Email");
		}
	}
}
