package Test;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String num = obj.next();
		
		int count = 1;
		StringBuilder s  = new StringBuilder();
		int i=0;
		char out = num.charAt(i++);
		while(i<num.length()) {
			if(out == num.charAt(i)) {
				count++;
			}else {
				s.append(count);
				s.append(out);
				out=num.charAt(i);
				count=1;
			}
			i++;
		}
		s.append(count);
		s.append(out);
		
		System.out.println(new String(s));
	}
}
