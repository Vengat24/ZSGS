package Day6;

import java.util.Scanner;

public class first {

	private static String username;
	private static String password;
	static {
		username = "Vengat";
		password = "Vengat@12345";
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		if(username.equals(obj.next())) {
			if(password.equals(obj.next())) {
				System.out.println("Logged In Successfully...");
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid UserName");
		}
		
		
		

	}

}
