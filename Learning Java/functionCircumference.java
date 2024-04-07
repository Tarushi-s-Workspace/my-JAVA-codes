// function to take radius as input and return circumference of circle

import java.util.*;
public class functionCircumference {

    public static void printcircumCircle(double radii){
        double circum= (2*3.14*radii);
        System.out.println(circum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double radii = sc.nextInt();
        printcircumCircle(radii);
        

    }
}
