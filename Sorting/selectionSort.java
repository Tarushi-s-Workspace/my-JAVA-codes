import java.util.*;
public class selectionSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // calling my function named selection
        // to apply it over the array arr
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[]arr){
        
    }
}



//  static void insertion(int[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i+1; j > 0; j--) {
//                 if (arr[j] < arr[j-1]) {
//                     swap(arr, j, j-1);
//                 } else {
//                     break;
//                 }
//             }
//         }
//     }

//     static void selection(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             // find the max item in the remaining array and swap with correct index
//             int last = arr.length - i - 1;
//             int maxIndex = getMaxIndex(arr, 0, last);
//             swap(arr, maxIndex, last);
//         }
//     }

//     static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }

//     static int getMaxIndex(int[] arr, int start, int end) {
//         int max = start;
//         for (int i = start; i <= end; i++) {
//             if (arr[max] < arr[i]) {
//                 max = i;
//             }
//         }
//         return max;
//     }
