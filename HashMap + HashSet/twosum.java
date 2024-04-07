import java.util.*;

public class twosum {
    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            if (hm1.containsKey(numbers[i])) {
                int index = hm1.get(numbers[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                break;
            } else {
                hm1.put(target - numbers[i], i);
            }
        }

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

