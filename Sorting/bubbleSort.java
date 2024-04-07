import java.util.*;
public class bubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // calling my function named bubble
        // to apply it over the array arr
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[]arr){
        boolean swapped;

        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if we did not swap for a particular value of i 
            //it means that array is already sorted so we will 
            //stop the program
            if(!swapped){
                break;
            }
        }
    }
}