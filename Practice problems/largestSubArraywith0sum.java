import java.util.*;
public class largestSubArraywith0sum {

    public static int maxLen(int arr[], int n){
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        int lenMax = 0;
        int i = -1;
        int sum =0;
        hm1.put(sum,i);

        while(i<n-1){
            i++;
            sum += arr[i];

            if(hm1.containsKey(sum)==false){
                hm1.put(sum,i);
            }

            else{
                int len = i - hm1.get(sum);
                if(len>lenMax){
                    lenMax = len;
                }
            }
        }
        return lenMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        // take array input from user
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxLen(arr, n));
    }
}
