import java.util.*;
public class Main1
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
        int Array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row =4;
        int col=4;
        int Rotate = obj.nextInt();
        int i=0;
        while(i<row){
            int rotate=Rotate % col;
            while( rotate != 0){
                int temp=Array[i][0];
                int j=0;
                while(j<col-1){
                    Array[i][j] = Array[i][j++ +1];
                }
                Array[i][j] =temp;
                rotate--;
            }
            i++;
        }
        i=0;
        while(i<row){
            int k=0;
            while(k<col){
                System.out.print(Array[i][k++] + " ");
            }
            i++;
            System.out.println(" ");
        }
	}
}
