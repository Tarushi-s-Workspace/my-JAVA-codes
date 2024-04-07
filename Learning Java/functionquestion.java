// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;

public class functionquestion {
   public static void main(String args[]) {
       int positive = 0, negative = 0, zeros = 0;
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();

       //pura while loop ke andar ka code tabhi execute hoga agar user ne 1 press kia hai, agar 0 hi press kia to seedha neeche aa jaenge 
       while(input == 1) {
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        if(number > 0) {
            positive++;
        } else if(number < 0) {
            negative++;
        } else {
            zeros++;
        }


        System.out.println("Press 1 to continue & 0 to stop");
        input = sc.nextInt();
    }


    System.out.println("Positives : "+ positive);
    System.out.println("Negatives : "+ negative);
    System.out.println("Zeros : "+ zeros);
}   
}

