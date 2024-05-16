import java.util.*;
public class Main2{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int Array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row = 4;
        int col = 4;
        int Rotate = obj.nextInt();
        int rotate=Rotate % col;
        int start=0;
        while(start<row ){
            int num=0;
            int result[] = new int[rotate];
            while(num < rotate ){
                result[num] = Array[start][num++];
            }
            int low=0;
            while(low < col-rotate){
                Array[start][low] = Array[start][low++ +rotate];
            }
            int varr=0;
            while(low <col){
                Array[start][low++] = result[varr++];
            }
            start++;
        }
        
        int i=0;
        while(i<row){
            int j=0;
            while(j<col){
                System.out.print(Array[i][j++] + " ");
            }
            i++;
            System.out.println(" ");
        }
    }
}
