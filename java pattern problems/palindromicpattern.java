//n=5 is given

import java.util.*;
public class palindromicpattern {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            // printing spaces for part one left side 
            int spaces= n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //first half ke numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //second half numbers
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
