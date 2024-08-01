package DAY1;

import java.util.Scanner;

public class five {
	public static void main(String[]args) {
		
		float weight[] = new float[10];
		Scanner obj = new Scanner(System.in);
		float avg=0;
		for(int i=0;i<1;i++) {
			weight[i] = obj.nextFloat();
			avg +=
					weight[i];
		}
		System.out.println("Average : " + avg/10);
		
		
		
	}

}
