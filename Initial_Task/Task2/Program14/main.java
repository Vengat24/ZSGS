public class Main
{
	public static void main(String[] args) {
	    int Arr[] = {9,2,7,4,5,0,6,3,8,1};
	    int Num[] = Arr;//Method 1
	    int Copy[] = new int[Arr.length];
	    for(int i=0;i<Arr.length;i++){
	        Copy[i] = Arr[i];//Method 2
		    System.out.print(Copy[i] + " ");
	    }
	}
}