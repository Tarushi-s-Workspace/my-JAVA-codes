// enter 3 num from user and make a function to print their average

import java.util.*;
public class functionaverage {

    public static int printaverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.print(avg);
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printaverage(a, b, c);
    }
}
