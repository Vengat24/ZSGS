import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    char Char = obj.next().charAt(0);
	    if((Char>='A' && Char <= 'Z' )||(Char>='a' && Char<='z'))
		    System.out.println("Alphabet");
		else
		    System.out.println("Not An Alphabet");
	}
}
