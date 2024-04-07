//Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class arrayHW1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //array size input from user
        int size = sc.nextInt();

        // creating array of input size
        String names[] = new String[size];

        //take names as input in the array
        for(int i=0;i<size;i++){
            names[i] = sc.next();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
    }
}



