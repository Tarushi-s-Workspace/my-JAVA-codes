//parameters act as variables inside the method/function
import java.util.*;
public class notRecursion1 {
    static void myMethod(String fname,int age){
        System.out.println(fname + " arora" + " age is " + age);
    }

    public static void main(String[] args){
        myMethod("Tarushi",21);
        myMethod("Aanshi",16);
    }
}
