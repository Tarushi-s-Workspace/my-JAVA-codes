// Finding max value in an array

import java.util.*;
public class max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18}; // predefined array is taken here 
        System.out.println(maxi(arr));
    }

    static int maxi(int[]arr){
        int maxVal= arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]> maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal; 
    }
}