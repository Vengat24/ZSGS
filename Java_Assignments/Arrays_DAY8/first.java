package Arrays_DAY8;

import java.util.Scanner;

/*1. Create a program that rotates the elements 
of an array to the right by a specified number
 of positions. Get the array and the rotation 
 count from the user*/
public class first {

	public static void main(String[] args) {
		Scanner obj =  new Scanner(System.in);
		System.out.print("Enter No of Elements : ");
		int n=obj.nextInt();
		System.out.print("Enter No of Rotate : ");
		int rotate = obj.nextInt()%n;
		System.out.println("Enter Elements : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = obj.nextInt();
		
		int temp[] = new int[rotate];
		for(int i=0;i<rotate;i++) {
			temp[i] = arr[i];
		}
		for(int i=rotate;i<n;i++) {
			arr[i-rotate] = arr[i]; 
		}
		int j=0;
		for(int i=n-rotate;i<n;i++) {
			arr[i] = temp[j++];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}	
	}
}


//for(int i=0;i<rotate;i++) {
//	int temp = arr[i];
//	for(int j=0;j<n-1;j++) {
//		arr[j] = arr[j+1];
//	}
//	arr[n-1] = temp;
//}