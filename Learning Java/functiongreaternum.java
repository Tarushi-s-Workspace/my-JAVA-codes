// function to take input of two numbers and return greater of those two

import java.util.*;
public class functiongreaternum {
    public static int numgreater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(numgreater(a, b));
    }
}
