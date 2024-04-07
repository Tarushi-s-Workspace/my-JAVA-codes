// function to check if a number is prime or not

import java.util.*;
public class functionprime {
    public static void printprime(int a){
        if(a==2) {
            System.out.println("a is Prime");
        }
        else{boolean isPrime = true;
            for(int i =2; i<=Math.sqrt(a);i++) {
                if(a%i==0) { // a is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if(isPrime== true) {
                System.out.println("a is Prime");
            } else{
                System.out.println("a is not prime");
            }
    
        }
        return;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printprime(a);
    }
}
