//https://takeuforward.org/data-structure/print-all-the-duplicates-in-the-string/
import java.util.*;
public class duplicateinString {
    public static void main(String[] args) {
        String str = "sinstriiintng";

        HashMap<Character,Integer> hm1 = new HashMap<>();

        for(int i=0;i<str.length();i++){
            hm1.put(str.charAt(i), hm1.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hm1.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}

// a better approach (2)

// import java.util.*;

// class Solution {
//     public static void main(String[] args) {
//         String str = "sinstriiintng";

//         int[] counts = new int[26];

//         for (int i = 0; i < str.length(); i++)
//             counts[str.charAt(i) - 'a']++;

//         for (int i = 0; i < 26; i++)
//             if (counts[i] > 1)
//                 System.out.println((char)(i + 'a') + " - " + counts[i]);
//     }
// }
