class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        //to store indices
        List<Integer> result = new ArrayList<>();
        //create frequency arrays
        int[] pCount = new int[26];
        int[] windowCount = new int[26];
        for(char c:p.toCharArray()){
            pCount[c - 'a']++;//'a' - 'a' = 0, 'b'-'a'=1...
        }
        for(int i=0;i<p.length();i++){
            windowCount[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(pCount, windowCount)){
            result.add(0);
        }
        //slide window
        for(int i=p.length();i<s.length();i++){
            windowCount[s.charAt(i) - 'a']++;
            //remove the character leaving the window
            windowCount[s.charAt(i-p.length()) - 'a']--;
            if(Arrays.equals(pCount, windowCount)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}