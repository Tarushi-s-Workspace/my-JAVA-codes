// Take an array as input from the user. Search for a given number x and print the index at which it occurs.
//LinearSearch

import java.util.*;
public class LinearSearching {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //creating an array as per size defined by user
        int numbers[] = new int[size];

        //array ka input user se lene ke liye

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();

        //searching for x in array
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x found at index: " + i);
            }
        }
    }
}












