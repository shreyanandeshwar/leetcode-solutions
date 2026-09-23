class Solution {
    public String toHex(int num) {
        String hex = "0123456789abcdef";
        if(num == 0){
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while(num!=0){
            int digit = num&15;//15 = 00001111 -> keeps only the last 4 bits
            result.append(hex.charAt(digit));
            num >>>= 4;//right shift -> one hexadecimal digit represents exactly 4 bits
        }
        return result.reverse().toString();
    }
}