// function to take age as input and return if person is eligible to vote or not.
// given that a person of age > 18 is eligible to vote

import java.util.*;
public class functionvote {

    public static void printageVote(int age){
        if(age>18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        printageVote(age);
    }

}
