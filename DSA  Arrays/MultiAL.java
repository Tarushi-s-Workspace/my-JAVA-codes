import java.util.*;
import java.util.ArrayList;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Adding three lists into it

        //initialisation
        for(int i =0;i<3;i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());   // get the array list at index i 
            }
        }
        System.out.println(list);
    }   
}

//ArrayList<ArrayList<integer>> list = new ArrayList<>();
