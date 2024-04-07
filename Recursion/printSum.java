//in recursion we take those variables in function jinki value will change as we progress towards our desired output

import java.util.*;
public class printSum{

    public static void PrintSum(int i, int n , int sum){
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum +=i;
        PrintSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        PrintSum(1, 5, 0);
    }// main function called print function
}

// another way

// public class Main {
//   public static void main(String[] args) {
//     int result = sum(5);
//     System.out.println(result);
//   }
//   public static int sum(int k) {
//     if (k > 0) {
//       return k + sum(k - 1);
//     } else {
//       return 0;
//     }
//   }
// }
