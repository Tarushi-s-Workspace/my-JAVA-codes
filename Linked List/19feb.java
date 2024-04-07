//https://www.geeksforgeeks.org/problems/game-with-string4100/1

class Solution{
    static int minValue(String s, int k){
        // code here
        int freq[] = new int[26];
        
        //iterating through each character in the input string s, and for each character, it updates the frequency count in the freq array based on its position in the English alphabet.
        for(int i = 0;i < s.length();i++)
			freq[s.charAt(i)-'a']++;
			
		// Priority queue to store the frequencies in descending order
		// Comparator is used to sort the elements in descending order
		PriorityQueue<Integer> pq=new PriorityQueue(s.length(), new Comparator<Integer>(){
			public int compare(Integer i1,Integer i2){
				return i2-i1;
			}
		});
		
		// Adding the frequencies to the priority queue
		for(int i = 0;i < 26;i++)
		    pq.add(freq[i]);
	    
	    // Performing k operations on the priority queue
	    while(k-- > 0){
		    int temp = pq.peek(); //int temp variable is used to temporarily store the frequency value of the element at the head of the priority queue p before it is decremented.(highest freq)
		    pq.poll(); // to remove most frequent character from my pq
		    temp = temp - 1; // decrementing the freq value
		    pq.add(temp);
		}
		
		// Calculating the result based on the modified priority queue
		int result = 0;
		while(!pq.isEmpty()){
		    int x = pq.peek();
		    result += (x*x);
		    pq.poll();
    }
    return result;
}
}