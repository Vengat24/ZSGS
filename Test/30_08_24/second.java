package Test;

public class second {
	public static void main(String[]args) {
		int num = 4;
		String str = generate(num);
		System.out.println(str);
		if(num==1)
			return;
		
		int i=str.length()-2;
		String cur = str.substring(i,i+2);
		while(i>0) {
			str = str.substring(0,i-1) + cur + str.substring(i+1);
			System.out.println(str);
			if(!str.equals(reverse(str))){
				System.out.println(reverse(str));
			}
			i-=2;
		}
		
		
		
	}
	static String reverse(String str) {
		String out="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i) == '(')
				out+= ')';
			else
				out+= '(';
		}
		return out;
		
	}
	static String generate(int num) {
		StringBuilder s  = new StringBuilder();
		for(int i=0;i<num;i++) {
			s.append("()");
		}
		return new String(s);
	}
}
