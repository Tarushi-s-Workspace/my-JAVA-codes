import java.util.*;
public class notRecursion {
    static void checkAge(int age){
        if(age<18){
            System.out.println("Access denied");
        }
        else{
            System.out.println("Permitted");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}
