public class Main
{
	public static void main(String[] args) {
	    int Array1[]= { 1,2,4,5,6,7,9,10,13,14};
        int Array2[] ={ 0,2,3,4,5,6,7,8,9,11,12,14,15};
        int i=0,k=0,j =0;
        int Result[] = new int[Array1.length + Array2.length];
        while(i<Array1.length && j<Array2.length){
            if(Array1[i] == Array2[j]){
                Result[k] = Array1[i];
                j++;
                i++;
            }
            else if(Array1[i] < Array2[j])
                Result[k] = Array1[i++];
                
            else if(Array2[j] < Array1[i])
                Result[k] = Array2[j++];
                
            System.out.print(Result[k++] + " ");
        }
        while(i<Array1.length){
            Result[k] = Array1[i++];
            System.out.print(Result[k++] + " ");
        }
        while(j<Array2.length){
            Result[k] = Array2[j++];
            System.out.print(Result[k++] + " ");
        }   
        
	}
}

