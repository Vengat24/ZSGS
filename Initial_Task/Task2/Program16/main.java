public class Main
{
	public static void main(String[] args) {
	    int Arr[] = {1, 2, 3, 4, 5, 6, 7,8,9};//
	    
	    int j =0;
	    while(j<Arr.length){
	        int i=j;
	        while(i<Arr.length){
	            if(j%2 == 0 && Arr[j] < Arr[i] ){
	                int temp = Arr[j];
	                Arr[j] = Arr[i];
	                Arr[i] = temp;
	            }
	            i++;
	        }
	        j++;
	    }
	    for(int i=0;i<Arr.length;i++)
    		System.out.print(Arr[i]);
	}
}
