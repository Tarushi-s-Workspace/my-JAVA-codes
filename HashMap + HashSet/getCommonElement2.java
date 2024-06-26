import java.util.*;
public class getCommonElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int[]a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int[]a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> fmap = new HashMap<>();
        //traversing array 1 to make the frequency map
        for(int val:a1){
            if(fmap.containsKey(val)){
                fmap.put(val,fmap.get(val)+1);
            }
            else{
                fmap.put(val, 1);
            }
        }
        // array 2, 1 ko consume karvaega
        for(int val: a2){
            if(fmap.containsKey(val) && fmap.get(val)>0){
                System.out.println(val);
                fmap.put(val,fmap.get(val)-1);
            }
        }
    }
}
