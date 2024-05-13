import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int Std = 101;
	    int group = obj.nextInt();
	    int Total = Std + group;
	    while(Std < Total){
	        int Num = Std;
	        System.out.println("Group " + Std%10 +":");
	        while(Num <= 120){
	            System.out.println(Num);
	            Num+=group;
	        }
	        System.out.println(" ");
	        Std++;
	    }
	}
}
