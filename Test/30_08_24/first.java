package Test;

import java.util.Scanner;

public class first {

	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		String sym[] = {"I","V","X","L","C","D","M"};
		int value[]  = { 1, 5, 10,50,100,500,1000};
		String input = obj.next();
		String pre = "";
		int i=input.length()-1;
		int sum=0;
		while(i>=0) {
			boolean pass = true;
			int ind  = findInd(input.substring(i,i+1),sym);
			if(ind == -1)
				return;
			if(input.charAt(i) == 'I' ||input.charAt(i) == 'X' || input.charAt(i)=='C') {
				if(pre.equals("V")|| pre.equals("X") ||pre.equals("L") || pre.equals("C") || pre.equals("D") || pre.equals("M")) {
					
					sum -= value[ind];
					pass = false;
				}
			}
			if(pass){
				sum += value[ind];
			}
			pre = sym[ind];
			i--;		
		}
		System.out.println(sum);
		
		
	}
	static int findInd(String val,String[] value){
		for(int i=0;i<value.length;i++) {
			if(value[i].equals(val)) {
				return i;
			}
		}
		return -1;
	}

}
