public class Main
{
	public static void main(String[] args) {
	    int input =5;
	    int k=1;
	    for(int i=0;i<input*2-1;i++){
	        char out[] = new char[input*2];
	        for(int j=0;j<out.length;j++){
	            out[j]='*';
	        }
	        
	        if(i<input){
	            for(int j=input-i;j<input+i;j++)
	                out[j] = '_';
	            System.out.print(new String(out)); 
	            
	        }
	        else{
	            for(int j=i-input+2; j < input*2 - (i - input + 2);j++)
	                out[j] = '_';
	           // k++;
	            System.out.print(new String(out)); 
	        }
	        System.out.println("");
	    }
	}
}
