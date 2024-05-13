import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    char Char = obj.next().charAt(0);
	    int num = (int) Char;
	    for(int i=num;i<=(int)'Z' ;i++){
	        System.out.print( (char)i);
	    }
	}
}
