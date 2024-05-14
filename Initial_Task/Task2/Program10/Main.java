import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    String str = obj.next(); //b3c6d15
	    int i=0;
	    while(i<str.length()){
	        if(str.charAt(i)>='a' && str.charAt(i)<='z'){
	            String num = str.substring(i+1,i+2);
	            if(i < str.length()-2 && str.charAt(i+2)>= '0' && str.charAt(i+2)<='9'){
	                num = str.substring(i+1,i+3);
	            }
	            for(int j=0;j<Integer.valueOf(num);j++)
	                System.out.print(str.charAt(i));
	            i++;     
	            }
	        
	        i++;
	    }
	    
	}
}
