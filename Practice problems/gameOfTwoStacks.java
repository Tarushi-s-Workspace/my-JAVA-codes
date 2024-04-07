// https://www.hackerrank.com/challenges/game-of-two-stacks/problem
import java.util.*;
public class gameOfTwoStacks {

    static int twoStacks(int maxSum,int[]a,int[]b){
        return twoStacks(maxSum,a,b,0,0)-1;
    }
    public static int twoStacks(int maxSum, int[]a, int[]b, int sum, int count){
        if(sum>maxSum){
            return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2 = twoStacks(maxSum,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);

        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxSum = sc.nextInt();
        int[]a = new int[n];
        int[]b = new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(twoStacks(maxSum,a,b));
    }
}
