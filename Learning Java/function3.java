//make a function to multiply 2 numbers and return their product
import java.util.*;
public class function3 {
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateProduct(a, b));
    }
}


