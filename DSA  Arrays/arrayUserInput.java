import java.util.*;
public class arrayUserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        //creating an array as per size defined by user

        int nums[] = new int[size];
        int sum =0;

        //array ka input user se lene ke liye
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }

        //Output  .. to directly use item using enhanced for loop(for each loop)
        //way:1 

         for(int num : nums){  // for every element in array, print the element 
            sum +=num;  // here num represents element of array
        } 
        
        
        //way:2
        // System.out.println(Arrays.toString(marks)); 
        // this is best practice to print an array and directly gives the output in array form with the spaces and closed brackets of array.

        //way:3  // traditional approach
        // for(int i=0;i<size;i++){
        //     System.out.print(marks[i] + " ");
        System.out.println(sum);
        }

        
        

        

        
        







        

    }


