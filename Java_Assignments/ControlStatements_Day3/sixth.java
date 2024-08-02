package Day3;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Number of Element : ");
		int n=obj.nextInt();
		System.out.println("Enter Elements : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = obj.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				sum += arr[i];
			}else {
				continue;
			}
		}
		System.out.println(sum);
		

	}

}
