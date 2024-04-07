//function to calculate greatest common divisor of two numbers

import java.util.*;
public class gcdfunction {

    public static void printgcd(int a, int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            
        }System.out.println(gcd);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printgcd(a, b);
    }
}
