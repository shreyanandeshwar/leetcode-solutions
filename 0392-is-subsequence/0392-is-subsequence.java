class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;//pointer 1
        for(int j=0;j<t.length();j++){ // pointer 2
            if(i < s.length() && s.charAt(i) == t.charAt(j)){
                i++;
            }
        }
        return i == s.length();
    }
}