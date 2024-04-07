// applicable when the array is in ascending order
import java.util.*;

public class binary {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // creating the function binarySearch was the first step here.
    // return the index 
    // return -1 if it does not exist
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // find middle element
            // int middle = (start + end) / 2;
            // MIGHT be possible that start + end exceeds therange of int in java if it comes too big 
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}