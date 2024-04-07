// Print a given name in function 

import java.util.*;
public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){      //main function
        Scanner sc= new Scanner(System.in);
        String name=sc.next();

        printMyName(name);  //call kiya function ko
    }
}
