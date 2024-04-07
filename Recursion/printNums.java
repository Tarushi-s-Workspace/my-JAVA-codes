// print numbers from 1 to 5
//every recursive function should have a halting condition. Infinite recursion when function never stops calling itself .
// so should 

package Recursion;
import java.util.*;
public class printNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        printNumb(n);
    }

    public static void printNumb(int n){
        //base case 
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    
}
