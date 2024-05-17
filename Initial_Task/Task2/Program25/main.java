public class Main
{
	public static void main(String[] args) {
	    String input = "1234567";
	    int len = input.length();
	    for(int i=0;i<len/2 ;i++){
	        for(int j=0;j<i;j++)
	            System.out.print(" ");
	        System.out.print(input.charAt(i));
	        for(int j=0;j<len-(i+1)*2;j++)
	            System.out.print(" ");
	        System.out.print(input.charAt(len-1-i));
	        System.out.println("");
	    }
	    for(int i=len/2;i<=len/2;i++){
	        for(int j=0;j<i;j++)
	            System.out.print(" ");
	        System.out.println(input.charAt(len/2));
	    }
	    
	    for(int i=(len/2)-1;i>=0;i--){
	        for(int j=0;j<i;j++)
	            System.out.print(" ");
	        System.out.print(input.charAt(i));
	        for(int j=0;j<len-(i+1)*2;j++)
	            System.out.print(" ");
	        System.out.print(input.charAt(len-1-i));
	        System.out.println("");
	    }
	    
	}
}
