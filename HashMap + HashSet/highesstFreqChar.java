import java.util.*;
public class highesstFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character,Integer> hm1= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hm1.containsKey(ch)){
                hm1.put(ch,hm1.get(ch)+1);
            }
            else{
                hm1.put(ch,1);
            }
        }
        char mfc = str.charAt(0);
        for(Character key:hm1.keySet()){
            if(hm1.get(key)>hm1.get(mfc)){
                mfc = key;
            }
            
        }
        System.out.println(mfc);
        

    }
}
