//n=5 given 

import java.util.*;
public class butterfly {
    public static void main(String args[]){
        int n=5;

        //part 1 ke stars .. upper half
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //print spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        //lower half
        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //print spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
