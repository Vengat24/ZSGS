package Day7;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = obj.next();
		String out="";
		for(int i=input.length()-1;i>=0;i--) {
			out += input.charAt(i);
		}
		System.out.println("Reverse Order : "+out);
		
	}

}
