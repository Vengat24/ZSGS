package Arrays_DAY8;

import java.util.Scanner;

//2. Write a program to find transpose of a matrix
public class second {

	public static void main(String[] args) {
		System.out.print("Enter No of Elements : ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[][] = new int[n][n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = obj.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

	}

}
