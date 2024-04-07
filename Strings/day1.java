import java.util.*;
public class day1 {
    public static void main(String[] args) {
        //concatenation
        // String firstName = "tarushi";
        // String lastName = "Arora";
        // String fullName = firstName + " "+ lastName;
        // System.out.println(fullName.length());

        // //charAt
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //compare 2 strings
        // s1>s2 : +ve value
        // s1< s2: -ve value
        //s1==s2 : 0
        //name1.compareTo, we use this because == fails in many cases

        // . substring(begIndex, end index)
        //strings are immutable
        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number); 
        // System.out.println("Tarushi" + 123);

        // String performance, this is not optimised O(n^2)
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('A'+i);
            series+=ch;
        }
        System.out.println(series);

    }
}

//String is a class
//every string we create is an object of type string
// String Pool: separate memory structure inside heap.
//all similar values of string are not created in pool, makes our program more optimized.

// String value same means it is in String pool
// if 2 reference variables are pointingto same string value, and i make change in the string value with help of any one ofthe reference variable then, it will not cause any harm beacsuse 
// usko change karne ke baad bhi pehle reference variable ki value mie koi change nhi hoga.
// In java Strings are immutable, they cant be changed

//Comparison of Strings
// == is a comparator,
//it checks if reference variables are pointing to same object 

// String a = new String(""), 2 objects with same values can be created
//when you only need to check values, use ,, .equals method

