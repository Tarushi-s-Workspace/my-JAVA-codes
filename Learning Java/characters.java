import java.util.*;
public class characters {
    public static void main(String[] args) {
        // a,A .. vowel
        // B constant
        // @, 1,2,3 .. invalid character
        Scanner sc = new Scanner(System.in);
        char charac = sc.next().charAt(0);
        if(charac=='a' || charac=='A'){
            System.out.println("Vowel");
        }
        else if(charac=='B'){
            System.out.println("Constant");
        }
        else{
            System.out.println("Invalid character");
        }

        


        
    }
}
