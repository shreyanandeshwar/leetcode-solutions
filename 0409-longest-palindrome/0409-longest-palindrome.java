class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        //count freq of each characters
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int length = 0;
        boolean hasOdd = false;
        for(int count:freq){
            length += (count/2)*2;//gives largest even number we can use
            if(count % 2 == 1){
                hasOdd = true;
            }
        }
        if(hasOdd){
            length++;//we can place one leftover character in the center
        }
        return length;
    }
}