package Arrays_DAY8;

import java.util.Scanner;

/*4. Initialize a jagged array with N rows with weights of N persons.
 Each person can have different number of weights. 
 Write 
      a. A function to enter the weight of any user at any time. 
      b. A function to calculate the minimum weight of the nth person.*/
public class fourth {
	static Scanner obj =  new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter no of Person : ");
		int n = obj.nextInt();
		int arr[][] = new int[n][];
		for(int i=0;i<n;i++) {
			System.out.print("Enter No of Weight for person "+ (i+1) +" : ");
			addWeight(arr,i, obj.nextInt());
		}
		
		System.out.print("Enter person to display : ");
		int d=obj.nextInt();
		displayWeight(arr,d);
	}
	static void addWeight(int arr[][],int i,int n) {
		int temp[] = new int[n];
		System.out.print("Enter Weight of person "+(i+1)+" : ");
		for(int j=0;j<n;j++) {
			temp[j] = obj.nextInt();
		}
		arr[i] = temp;
	}
	static void displayWeight(int arr[][], int i) {
		System.out.println("Weight of Person "+i);
		for(int j=0;j<arr[i-1].length;j++) {
			System.out.print(arr[i-1][j] +" ");
		}
	}

}
