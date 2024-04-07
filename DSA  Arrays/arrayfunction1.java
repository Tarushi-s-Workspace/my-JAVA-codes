import java.util.*;
public class arrayfunction1 {

    public static void change(int[]arr){  // here change is function name; inside which we have listed what we want this function to do when it is called out by us in our program
        arr[0]=88;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums ={2,3,4,5,6};
        System.out.println(Arrays.toString(nums));

        change(nums); // calling the function named as change
        System.out.println(Arrays.toString(nums));
    }
}
