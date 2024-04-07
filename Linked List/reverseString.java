// this is not optimized in terms of tc, since we are using stack
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(revereseWords(S));

    }
    public static String revereseWords(String S){
        Stack<String> st = new Stack<>();
        StringBuilder word = new StringBuilder();
        
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch!= '.'){
                word.append(ch);
            }
            else{
                st.push(word.toString());
                word.setLength(0);
                st.push(".");
            }
        }

        if(word.length()>0){
            st.push(word.toString());
        }

        StringBuilder reversedString = new StringBuilder();
        while(!st.isEmpty()){
            reversedString.append(st.pop());
        }
        return reversedString.toString();
    }
}


//String st = "TUF is great for interview preparation";
//preparation interview for great is TUF 
// ans variable ko check karo