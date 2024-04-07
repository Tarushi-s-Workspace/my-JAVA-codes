

import java.util.*;
public class revision {
    public static void main(String[] args) {
        int arr[] = {1,66,2,54,98,72};
        System.out.println(maxim(arr));

    }

    static int maxim(int arr[]){
        int maxVal = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];

            }
        }
        return maxVal;
    }
}


