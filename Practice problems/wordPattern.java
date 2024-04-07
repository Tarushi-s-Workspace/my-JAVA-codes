import java.util.*;
public class wordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "A man, a plan, a canal: Panama";
        boolean result=isPalindrome(s);
        System.out.println(result);
    }
    static boolean isPalindrome(String s){
        StringBuilder newStr = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        String my = newStr.toString();
        int left =0;
        int right = my.length()-1;
        while(left<right){
            if(my.charAt(left)!=my.charAt(right)){
            return false;
        }
        left++;
        right--;
        }
        return true;
        
    }
    
}
    

