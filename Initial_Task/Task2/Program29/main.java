
public class Main
{
	public static void main(String[] args) {
	    int input =6;
	    for(int i=0;i<input;i++){
	        for(int j=0;j<input;j++){
	            if(j == 0 || i ==0 || i==input-1) 
	                System.out.print("* ");
	        }
	        System.out.println("");
	    }
	}
}
