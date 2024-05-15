public class Main
{
	public static void main(String[] args) {
	    int Arr[] = {9,2,7,4,5,0,6,3,8,1};
	    int i=0;
	    int Num = Arr[i];
	    int min = 0;
	    while(i<Arr.length-1){
	        min = Arr[i];
	        if(Arr[i]>Arr[i+1])
	            min = Arr[i+1];
	        Num = Math.min(min,Num);
	        i++;
	    }
	    System.out.println(Num);
	}
}