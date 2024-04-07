class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hm1 = new HashMap<>();

        // Iterating through characters in the string magazine
        for(int i=0;i<magazine.length();i++){
            char a = magazine.charAt(i);

            if(!hm1.containsKey(a)){
            hm1.put(a,1);
           }
            else{
            hm1.put(a,hm1.get(a)+1);
        }
    }
        for(int i=0;i<ransomNote.length();i++){
            char a = ransomNote.charAt(i);

           if(hm1.containsKey(a) && hm1.get(a)>0){
            hm1.put(a,hm1.get(a)-1);
           }
           else{
            return false;
        }
    }
        return true;

    }
}