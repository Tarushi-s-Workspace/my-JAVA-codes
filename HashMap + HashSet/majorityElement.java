import java.util.*;
public class majorityElement {
    static void majority(int nums[]){
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(hm1.containsKey(nums[i])){
                hm1.put(nums[i],hm1.get(nums[i])+1);
            }
            else{
                hm1.put(nums[i],1);
            }
        }
        for(int key:hm1.keySet()){
            if(hm1.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,1,2,3,1,1,1,8,2};
        majority(nums);
    }
}


