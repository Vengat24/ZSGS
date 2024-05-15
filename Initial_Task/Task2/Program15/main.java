import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int Len = obj.nextInt();
	    int Arr[] = new int[Len];
	    
	    for(int i=0;i<Len;i++){
	        Arr[i] = obj.nextInt();        
	    }
	    System.out.print("Repeated : ");
	    for(int i =0;i<Len;i++){
	        int count=0;
	        for(int j=i;j<Len;j++){
	            if(Arr[i] == Arr[j])
	                count++;
	        }
	        if(count>1)
	            System.out.print( Arr[i] + " ");
	    }
	}
}
