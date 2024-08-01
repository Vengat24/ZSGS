package Day7;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = obj.next();
		String vowels = "aeiouAEIOU";
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(vowels.contains(input.substring(i,i+1))) {
				count++;
			}
		}
		System.out.println("Vowels Count : " + count);

	}

}
