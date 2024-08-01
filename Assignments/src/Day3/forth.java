package Day3;

import java.util.Scanner;

public class forth {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number of Element : ");
		int n=obj.nextInt();
		System.out.println("Enter Elements : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		System.out.println("Enter Target : ");
		int target = obj.nextInt();
		int count=2;
		for(int i=0;i<n;i++) {
			if(target == arr[i])
				--count;
			if(count==0) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
