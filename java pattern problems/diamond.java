// n=4 is given ......after printing  4 lines of pattern given same pattern is being repeated but in reverse order

import java.util.*;
public class diamond {
    public static void main(String args[]){
        int n=4;
        //upper part

        for(int i=1;i<=n;i++){
            // printing left side spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i=n;i>=1;i--){
            // printing left side spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
