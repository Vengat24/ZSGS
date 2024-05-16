
public class Main
{
	public static void main(String[] args) {
	    int num=9;
	    for(int i=num;i>0;i--){
	        for(int k=1;k<i;k++){
	            System.out.print("  ");
	        }
	        for(int j=i;j<=num;j++){
	            System.out.print(j + " ");
	        }
	        
	        for(int x=num-1;x>=i;x--){
	            System.out.print(x + " ");
	        }
	        System.out.println("");
	    }
	}
}
