// finding max item in a given range in array

import java.util.*;
public class findMax {

    public static int findMaxInRange(int[]arr, int start, int end){
        if(arr==null || arr.length==0 || start>end){
            return -1;
        }

        int max = arr[start];
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,2,8,5,9,1};
        int start = 1;
        int end = 4;
        int maxInRange = findMaxInRange(arr,start,end);
        System.out.println(maxInRange);
    }
}
