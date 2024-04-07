import java.util.*;
public class ques1 {

    public static int[] moveZeroes(int n, int []a){
        ArrayList<Integer> tempArr = new ArrayList<>();

        //put non zero elements from your original array to tempArr

        for(int i=0;i<n;i++){
            if(a[i] != 0){
                tempArr.add(a[i]);
            }
        }

            //non zero elements
            int nonZero=tempArr.size();

            for(int i=0;i<nonZero;i++){
                a[i]=tempArr.get(i);
            }
            for(int i=nonZero;i<n;i++){
                a[i]=0;
            }
            return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Size of array
        int n = sc.nextInt();
        // Taking array input from user
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int [] ans = moveZeroes(n, arr);
        System.out.println(Arrays.toString(ans));
    }
}