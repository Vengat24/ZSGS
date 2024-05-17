public class Main
{
	public static void main(String[] args) {
	    int input=9;
	    int out=0;
	    int sum=0;
	    while(input!=0){
	        out = out * 10 + 1;
	        sum = sum + out;
	        input--;
	    }
		System.out.println(sum);
	}
}
