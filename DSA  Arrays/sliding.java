import java.util.*;
public class sliding {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int res = minSubArrayLen(7,arr);
        System.out.println("Minimum subarray length with sum >= " + 7 + ": " + res);
    }
    public static int minSubArrayLen(int target,int[]nums){
        int start =0;
        int end =0;
        int sum = 0;
        int minLen=Integer.MAX_VALUE;

        while(end<nums.length){
            sum+=nums[end];
            end+=1;

            while(sum>=target){
                minLen=Math.min(minLen,end-start);
                sum-=nums[start];
                start+=1;
            }
    }
    if(minLen==Integer.MAX_VALUE){
        return 0;
    }
    return minLen;
}
}
