// For a matrix of N x M print its transpose.

import java.util.*;
public class transpose2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n rows
        int m = sc.nextInt(); // m columns

        int [][] arr = new int[n][m];
        //input of 2D array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is : ");

        // to print transpose
        for(int j=0;j<m;j++){
            for (int i=0;i<n;i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
