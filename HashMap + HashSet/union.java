// Union of 2 arrays
import java.util.*;
public class union {

    public static int func(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static void main(String[] args){
        int arr1[]={7,3,9};
        int arr2[]={2,3,7,8,1,4};
        int result = func(arr1, arr2);
        System.out.println(result);
    }
    
}
