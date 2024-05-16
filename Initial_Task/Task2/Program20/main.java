
public class Main
{
	public static void main(String[] args) {
	    int num=9;
	    for(int i=1;i<=num;i++){
	        for(int k=num;k>i;k--){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print(j + " ");
	        }
	        for(int x=i-1;x>0;x--){
	            System.out.print(x + " ");
	        }
	        System.out.println("");
	    }
	}
}
