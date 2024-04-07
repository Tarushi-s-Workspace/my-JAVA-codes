//https://takeuforward.org/data-structure/reverse-words-in-a-string/

//using Stack
import java.util.Stack;

public class reverseWords {
    public static String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        Stack<String> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c!=' '){
                word.append(c);
            }
            else{
                if(word.length()>0){
                    st.push(word.toString());
                    word = new StringBuilder(); // reset the word
                }
            }
        }

        // there ight be one last word remaining in stringBuilder, lets check
        // and push the last word onto the stack

        if(word.length()>0){
            st.push(word.toString());
        }

        // now comes the time to remove the words from our stack one by one 
        // and put them in a stringBuilder.

        StringBuilder reversedSentence = new StringBuilder();
        while(!st.isEmpty()){
            reversedSentence.append(st.pop()).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String input1 = "this is an amazing program";
        String input2 = "This is decent";

        System.out.println("Input 1: " + reverseWords(input1));
        System.out.println("Input 2: " + reverseWords(input2));
    }
}

// S = i.like.this.program.very.much

// if(c!='.'){
//     word.append(c);
// }

// else{
    // first push the word, then set the stringBuilder length to 0,
    // then push the .
//     stack.push(word.toString());
//     word.setLength()=0;

//     stack.push(".");
// }

// if(word.length>0){
//     stack.push(word.toString());
// }