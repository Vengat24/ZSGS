package Day7;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = obj.nextLine();
		String arr[] = input.split(" ");
		String out="";
		for(int i=0;i<arr.length;i++) {
			out += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1) + " ";
		}
		System.out.println(out);

	}

}
