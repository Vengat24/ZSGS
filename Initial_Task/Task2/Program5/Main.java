import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    System.out.println("Enter Coefficient of x^2 : ");
	    int a= obj.nextInt();
	    System.out.println("Enter Coefficient of x : ");
	    int b= obj.nextInt();
	    System.out.println("Enter Constant : ");
	    int c = obj.nextInt();
	    
		System.out.print("Roots : " + (- b + Math.sqrt(b*b - 4*a*c)) / (2*a) + " , ");
		System.out.println((- b - Math.sqrt(b*b - 4*a*c)) / (2*a)  );
	}
}
