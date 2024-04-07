import java.util.*;
public class hollowbutterfly {
    public static void main(String args[]){
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //left part 
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            // beech ke spaces
            int spaces=2*n-2*i; // this step is game changer here
            
            // for beech ke part ke spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // for right part
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();


         // same pattern repeated downwards but ulta karke
        } for(int i=n;i>=1;i--){
            //left part 
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            // beech ke spaces
            int spaces=2*n-2*i; // this step is game changer here
            
            // for right part 
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();



        }

    }       

}




