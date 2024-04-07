//what if we dont know size kitna chahie array ka 
// hey java let me input any number of elements
// in such a case we use array lists
// when we dont know how much size we want and wanna take any number of inputs
//ArrayList is class here
// generics( lAter in OOPS) <datatype> is telling me here that what is the type of data that i can store in this list object
// list object ka method add
//initial capacity doesnt matter
import java.util.ArrayList;
import java.util.*;
public class ArraylistEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(57);
        // list.add(90);
        // list.add(99);
        // list.add(88);
        // list.add(34);
        // list.add(33);
        // System.out.println(list);
        // System.out.println(list.contains(66));
        // list.set(0,99);
        // list.remove(2);
        // System.out.println(list);


        // Input
        for(int i =0;i<5;i++){
            list.add(sc.nextInt());
        }
        // //get item at any index 
        // for(int i =0;i<5;i++){
        //     System.out.println(list.get(i)); //pass index here, list[index] wont work here
        // }

        System.out.println(list);

    }
}

//ArrayList<integer> list = new ArrayList<>()

// list is the reference variable
// <integer> is datatype,wrapperclass and not primitive
// new ArrayList<>() is called as ArrayListConstructor

// Some Methods
// 1) add()
// 2) set(index,value): to update value for a specified index
// 3) get(Index): to get existing value for specified undex



