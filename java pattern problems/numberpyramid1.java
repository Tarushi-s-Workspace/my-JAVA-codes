import java.util.*;
public class numberpyramid1 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            //inner loop for printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // numbers print 
            for(int j=1;j<=i;j++){
                System.out.print(i + " "); // this point is very important to note down here that why 
                                            //we are printing i + space here, its because in pattern we have 1 on 1 line , 2 on another and so on just like the row number that is i here.
            }
            System.out.println();
        }
    }
}

































