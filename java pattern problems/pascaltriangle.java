//pasacal triangle without spaces

import java.util.*;
public class pascaltriangle {
    public static void main(String args[]){
        int n=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            System.out.println((int)(Math.pow(11,n++)));
            

        }
    }
}








