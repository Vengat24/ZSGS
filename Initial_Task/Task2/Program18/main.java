public class Main
{
	public static void main(String[] args) {
	    int Array[] = {13,2,4,15,12,10,5} ; //13,2,12,10,5,15,4
		int i=0;
		while(i<Array.length){
		    int j=i;
		    while(j<Array.length){
		        if(i%2 == 0 && Array[i] < Array[j]){
		            int temp = Array[i];
		            Array[i] = Array[j];
		            Array[j] = temp;
		        }
		        else if(i%2 == 1 && Array[i] > Array[j]){
		            int temp = Array[i];
		            Array[i] = Array[j];
		            Array[j] = temp;
		        }
		        j+=2;
		    }
		    i++;
		}
		for(int k=0;k<Array.length;k++)
		    System.out.print(Array[k] + " ");
	}
}

