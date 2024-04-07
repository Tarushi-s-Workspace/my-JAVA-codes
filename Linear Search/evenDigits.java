import java.util.*;

public class evenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};

        System.out.println(digits(345));
    }

    static int findNumbers(int[]nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberofDigits = digits(num);

        return numberofDigits % 2 == 0;
    }
    

    // method 2
    static int digits2(int num){
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    //count no of digits in a number
    static int digits(int num){
        if(num<0){
            num = num * -1;
        }

        if(num ==0){
            return 1;
        }

        int count =0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}


