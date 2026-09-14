class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i >= 0 || j >= 0){
            int bitA = (i >= 0)?a.charAt(i)-'0':0;//'0'=48,'1'=49 => 49-48=1 or 48-48=0
            int bitB = (j >= 0)?b.charAt(j)-'0':0;
            int sum = bitA + bitB + carry;
            carry = sum/2;
            result.append(sum % 2);
            i--;
            j--;
        }
        if(carry > 0){
            result.append(carry);
        }
        return result.reverse().toString();//reverse because we have calculated sum from right to left
    }
}