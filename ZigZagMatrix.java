import java.util.*;
public class ZigZagMatrix {
    public static void printZigZag(int[][] array){
        int rows = array.length;
        if(rows ==0){
            return;
        }
        int cols = array[0].length;
        for(int i=0;i<rows;i++){
            if(i%2==0){
                for(int j=0;j<cols;j++){
                    System.out.print(array[i][j] + " ");
                }
            }
            else{
                for(int j=cols-1;j>=0;j--){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int r = s.nextInt();
        System.out.print("Enter the number of columns:");
        int c = s.nextInt();
        int [][] array = new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j] = s.nextInt();
            }
        }
        printZigZag(array);
        s.close();
    }
    
}
