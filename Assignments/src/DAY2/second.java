package DAY2;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter A Value : ");
		float a = obj.nextFloat();
		System.out.println("Enter B Value : ");
		float b=obj.nextFloat();
		System.out.println("Enter C Value : ");
		float c=obj.nextFloat();
		System.out.println("The Possible Roots Are : ");
		double balance = b*b - 4.0*a*c;
		double div = 2.0 * a;
		if(balance>0) {
          double root1 = (-b + Math.pow(balance, 0.5)) / div;
          double root2 = (-b - Math.pow(balance, 0.5)) / div;
          System.out.println(root1 + " " + root2);
      }
      else if(balance==0){
          double root = (-b)/ div;
          System.out.println(root);
      }
      else{
    	  balance=balance*(-1);
          System.out.println(((-b)/div) +"+"+(Math.pow(balance, 0.5))/div+"i");
          System.out.println(((-b)/div )+"-"+(Math.pow(balance, 0.5))/div+"i");
      }
	}

}
