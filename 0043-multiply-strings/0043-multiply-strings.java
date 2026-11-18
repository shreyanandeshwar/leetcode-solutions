class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m+n];//max result length is m+n
        for(int i=m-1;i>=0;i--){
            int carry = 0;
            for(int j=n-1;j>=0;j--){
                int sum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0') + result[i+j+1] + carry;//result[2+2+1]=result[5]=0 at starting
                result[i+j+1] = sum % 10;
                carry = sum/10;
            }
            result[i] += carry;
        }
        StringBuilder sb = new StringBuilder();
        for(int digit : result){
            if(sb.length() == 0 && digit == 0){
                continue;
            }
            sb.append(digit);
        }
        return sb.toString();
    }
}