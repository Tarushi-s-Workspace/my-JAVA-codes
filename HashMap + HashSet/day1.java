// In HashMap we use put(K,V), remove(K),values()
//map.put(), new case/update key
//map.containsKey 
//map.get( )
import java.util.*;
public class day1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap1 = new HashMap<>();
        hashmap1.put("Tarushi", 21);
        hashmap1.put("Ayushi",20);
        hashmap1.put("Tanisha",19);
        System.out.println(hashmap1);
        int j=hashmap1.get("Tarushi");
        System.out.println(j);
    }
}

