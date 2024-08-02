package Arrays_DAY8;

import java.util.Scanner;

/*3. Write a program to generate the matrix with
integers in spiral order. Get size N from the user
and generate an NxN spiral matrix.*/
public class third {

	public static void main(String[] args) {
		System.out.print("Enter No of Rows : ");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[][] = new int[n][n];
		int val=1;
		int i=0;
		int j=0;
		int c=1;
		while(val<n*n) {		
			while(j<n-c)
				arr[i][j++] = val++;
			while(i<n-c)
				arr[i++][j] = val++;
			c++;
			while(j>=c-1)
				arr[i][j--] = val++;
			while(i>=c-2 && j+1!=i)
				arr[i--][j] = val++;
		}
		
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				System.out.print(arr[x][y] +" ");
			}
			System.out.println();
		}

	}

}
