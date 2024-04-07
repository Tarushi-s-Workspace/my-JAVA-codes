import java.util.*;
public class findMin {
    public static void main(String[] args) {
        int [] arr = {34,87,11,2,3,-6,-16};
        System.out.println(min(arr));
    }

    static int min(int[]arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}

// pair <Integer, string> p = new pair <> (5, "five")