class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;
        for(int i=0;i<s.length();i++){
            //if b is encountered
            if(s.charAt(i)=='b'){
                foundB = true;
            }
            //if a is encountered after b is found
            if(s.charAt(i) == 'a' && foundB){
                return false;
            }
        }
        return true;
    }
}