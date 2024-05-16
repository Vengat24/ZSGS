public class Main
{
	public static void main(String[] args) {
	    int num=10;
	    int i=1;
	    int j=1;
	    while(i<=num){
	       i+= j++;
	    }
	    int count = j-1;
	    i=1;
	    j=1;
	    while(i<=num){
	        int x=0;
	        while(x<count-j){
	            System.out.print(" ");
	            x++;
	        }
	        int k=0;
	        while(k<j && i<=num){
	            System.out.print(i + " ");
	            i++;
	            k++;
	        }
	        System.out.println("");
	        j++;
	    }
	}
}
