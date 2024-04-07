import java.util.*;
public class RowColmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr,49)));
    }

    static int [] search(int[][]matrix,int target){   // return matrix []
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}