import java.util.*;
public class Main
{
    public static String Rev(String str){
        int i=str.length()-1;
        while(i>=0){
            if(str.charAt(i) == ' '){
                return str.substring(i+1) + " " + Rev(str.substring(0,i))  ;
            }
            else if(i == 0)
                return str.substring(i);
            i--;
        }
        return "h";
    }
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine(); // one two three
		System.out.println(Rev(str));
		obj.close();
	}
}
