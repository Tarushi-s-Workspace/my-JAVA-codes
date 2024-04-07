//// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
import java.util.*;
public class infiniteArray {
    public static void main(String[] args) {
        int arr[]={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
        
    }

    static int ans(int[]arr,int target){
        //first we will find a range to be searched upon since its an infinite array and we dont know the starting and ending index to run our Binary Search
        //initially we will start with a box size means search window sort of size 2
        //then exponentially we will double the size of our search window in each step in order to search for the target within that infinite array

        int start = 0;
        int end = 1;

        //condition for target to lie within range
        while(target>arr[end]){
            int newStart = end +1; //important
            end = end + (end-start+1)*2; //important
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;   
    }
    //nothing found return -1 coming out of the while loop
    
}
