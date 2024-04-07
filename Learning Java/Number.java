import java.util.*;
public class Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        if(no %2 ==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close(); // ye likhne se you won't get that sc vala error

    }
}
