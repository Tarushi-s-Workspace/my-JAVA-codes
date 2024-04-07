import java.util.*;   
public class invhalfpyr{
    public static void main(String args[]) {
        int n =4;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> space print
            for(int j=1; j<=n-i;j++) { //n-i spaces in each line before stars
                System.out.print(" ");
            }
            //inner loop to print stars
            for(int j =1; j<=i;j++) {     //2 inner loops for printing this pattern
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
