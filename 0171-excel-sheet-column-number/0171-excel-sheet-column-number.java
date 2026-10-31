class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i=0;i<columnTitle.length();i++){
            //convert current letter into a number
            int value = columnTitle.charAt(i) - 'A' + 1;//'A'-'A'+1=1, 'B'-'A'+1=2
            result = result * 26 + value;//for multiple letters=>AB=1*26+2=28
        }
        return result;
    }
}