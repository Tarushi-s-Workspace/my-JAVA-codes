//LinkedIn test question circular printer of alphabets

public class circularPrinter {

    public static long getMinTime(String str) {
        long minTime = 0L;
        char prev = 'A';
        for (char c : str.toCharArray()) {
            long delta = (c - prev + 26) % 26; // Handle circular nature
            minTime += Math.min(delta, 26 - delta); 
            prev = c;
        }
        return minTime;
    }

    public static void main(String[] args) {
        String str = "AZGB";
        long minTime = getMinTime(str);
        System.out.println("The minimum time is: " + minTime);
    }
}
// using 0L to match the datatype long, represnting 0 as a long integer

//If (c - prev + 26) is greater than or equal to 26, this modulus operation ensures that the result is between 0 and 25, which represents the positions in the alphabet from 'A' to 'Z'.

//this operation effectively wraps the result within the range of 0 to 25 (inclusive), which corresponds to the positions in the alphabet from 'A' to 'Z'.

//If the result of (c - prev + 26) is greater than or equal to 26, % 26 will bring it back into this range.
//If the result is less than 26, % 26 will leave it unchanged, ensuring that it remains within the valid alphabet positions.
// we want to calculate the positive number of positions
// we need to move to get from prev to c in a circular manner, so

// By adding +26, we ensure that the result is always positive or zero.
// This is because adding 26 to a negative number 
//effectively "wraps" it around to the positive equivalent within the range of 0 to 25, 
//which corresponds to the positions in the alphabet from 'A' to 'Z'. 
//This ensures that we correctly account for the circular nature of the alphabet when calculating the minimum distance between characters, 
//regardless of their order in the alphabet.

// delta: clockwise 
// 26 - delta: counterClockwise

// ArrayList<Integer> myList = new ArrayList<>();