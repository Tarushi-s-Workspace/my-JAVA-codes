import java.util.*;
public class methodOverloading {

    static int plusMethod(int x,int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(plusMethod(10,2));
        System.out.println(plusMethod(4.3,6.2));
    }
}
