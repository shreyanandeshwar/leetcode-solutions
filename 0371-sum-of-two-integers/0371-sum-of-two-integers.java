class Solution {
    public int getSum(int a, int b) {
        int sum = a^b; //sum without carry
        int carry = (a & b) << 1; //left shift
        while(carry != 0){
            int newSum = sum ^ carry;
            int newCarry = (sum & carry) << 1;
            //replace old sum & carry
            sum = newSum;
            carry = newCarry;
        }
        return sum;
    }
}