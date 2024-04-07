import java.util.*;
public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int ans = romanToInt(s);
        System.out.println(ans);
    }
    public static int romanToInt(String s){
        HashMap<Character,Integer> hm1 = new HashMap<>();
        hm1.put('I',1);
        hm1.put('V',5);
        hm1.put('X',10);
        hm1.put('L',50);
        hm1.put('C',100);
        hm1.put('D',500);
        hm1.put('M',1000);

        int value = hm1.get(s.charAt(s.length()-1));
        for(int i = s.length()-2;i>=0;i--){
            if(hm1.get(s.charAt(i))<hm1.get(s.charAt(i+1))){
                value-=hm1.get(s.charAt(i));
            }
            else{
                value+=hm1.get(s.charAt(i));
            }
        }
        return value;
    }
}
