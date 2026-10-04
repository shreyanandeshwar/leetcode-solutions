class Solution {
    public boolean checkValidString(String s) {
        int low = 0;//min possible no. of unmatched (
        int high = 0;//max possible no. of unmatched (
        for(char c:s.toCharArray()){
            if(c == '('){
                low++;
                high++;
            }
            else if(c == ')'){
                low--;
                high--;
            }
            else{ //empty
                low--;
                high++;
            }
            low = Math.max(low, 0); //to prevent from becoming negative
            if(high < 0){
                return false;
            }
        }
        return low == 0;
    }
}