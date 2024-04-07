// find factorial of a number 

import java.util.*;
public class function2 {
    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        int factorial =1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){    //MAIN Function
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        printFactorial(n);
    }
}


