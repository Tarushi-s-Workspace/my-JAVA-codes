import java.util.HashSet;
import java.util.Iterator;

public class hashsett {
    public static void main(String[] args) {
        HashSet<Integer> Set1 = new HashSet<>();
        
        // Add
        Set1.add(1);
        Set1.add(2);
        Set1.add(3);
        Set1.add(3);

        //Size
        System.out.println(Set1.size());

        //Search
        if(Set1.contains(3)){
            System.out.println("Present");
        }
        
        if(!Set1.contains(2)){
            System.out.println("Not present");
        }

        //Delete
        Set1.remove(1);

        //Print hashset
        System.out.println(Set1);

        //Creating iterator
        Iterator it = Set1.iterator();

        while(it.hasNext()){
            System.out.println(it.next()+ ", ");
        }
        

        //isEmpty
        if(!Set1.isEmpty()){
            System.out.println("Set is not empty");
        }




    }
}
