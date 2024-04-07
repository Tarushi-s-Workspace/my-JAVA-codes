import java.util.*;
public class functionexample {

    public static void change(int[]nums){
        nums[0]=99;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
}

