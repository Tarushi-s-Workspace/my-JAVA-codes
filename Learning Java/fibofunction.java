//program to print Fibonacci series of n terms where n is input by user: 0 1 1 2 3 5 8 13 21 ..... 
//Hint: in fibonacci series a number is sum of previous 2 numbers that came before it. series start from 0 and 1.
import java.util.*;
public class fibofunction {
    public static void printfibonacciseries(int n){
        int a =0,b=1; 
        int counter=0;

        //iterate till counter is N
        while(counter<n){
            //print number
            System.out.print(a + " ");

            //swap
            int c= b+a;
            a=b;
            b=c;
            counter+=1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfibonacciseries(n);
    }
}
