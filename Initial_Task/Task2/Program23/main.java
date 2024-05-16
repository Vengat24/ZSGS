
public class Main
{
	public static void main(String[] args) {
	    int num =9;
	    for(int j=num;j>0;j--){
	        for(int k=num;k>j;k--){
	            System.out.print(" ");
	        }
	        for(int i=j;i>0;i--){
	            
	            System.out.print(j + " ");
	        }
	        System.out.println("");
	    }
	}
}
