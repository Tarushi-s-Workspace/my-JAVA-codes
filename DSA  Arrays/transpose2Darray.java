// For a matrix of N x M print its transpose.

import java.util.*;
public class transpose2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("original 2d array is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // 
        System.out.println("Transpose is");
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
