// time complexity is O(n)
public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();
        System.out.println(builder);
    }   
    
    
}


public class LexicographicallyFirstPalindromicString {

    public static String getLexicographicallyFirstPalindromicString(String str) {
        int n = str.length();
        char[] arr = str.toCharArray();

        // Helper function to check if a string is lexicographically smaller than another
        // Return true if s1 < s2, false otherwise
        boolean isLexicographicallySmaller(String s1, String s2) {
            return s1.compareTo(s2) < 0;
        }

        // Helper function to increment a character by one
        void incrementCharacter(char[] arr, int index) {
            if (arr[index] == 'z') {
                arr[index] = 'a';
            } else {
                arr[index]++;
            }
        }

        for (int i = 0; i < (n + 1) / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                // Create the palindrome by appending the reverse of the first half at the end
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    sb.append(arr[j]);
                }
                sb.append(arr[i]);
                for (int j = i - 1; j >= 0; j--) {
                    sb.append(arr[j]);
                }

                String palindrome = sb.toString();
                if (isLexicographicallySmaller(palindrome, str)) {
                    return palindrome;
                }

                // Increment the first character and repeat the process
                incrementCharacter(arr, i);
                i = -1; // Start from the beginning again
            }
        }

        // If the loop completes without finding a lexicographically smaller palindrome,
        // it means the input string itself is the lexicographically first palindromic string.
        return str;
    }

    public static void main(String[] args) {
        String inputString = "bcaabb";
        String firstPalindrome = getLexicographicallyFirstPalindromicString(inputString);
        System.out.println("Lexicographically first palindromic string: " + firstPalindrome);
    }
}
