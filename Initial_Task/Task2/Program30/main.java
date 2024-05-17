public class Main
{
	public static void main(String[] args) {
	    int Array[][] = {{1,2,3},{4,5,6},{7,8,9}};
	    int x = 0;
	    while(x<Array.length+Array[0].length-1){
	    for(int i=0;i<Array.length;i++){
	        for(int j=0;j<Array[0].length;j++){
	            if(i+j == x){
	                System.out.print(Array[i][j] + " "); 
	            }
	        }
	    }
	    System.out.println("");
	    x++;
	}
	
	}
}
