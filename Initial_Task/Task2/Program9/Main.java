import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int num = obj.nextInt();
	    while(num!=0){
	        System.out.print(num%10);
	        num/=10;
	    }
	}
}
