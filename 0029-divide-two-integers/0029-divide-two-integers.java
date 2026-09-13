class Solution {
    public int divide(int dividend, int divisor) {
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long quotient  = 0;

        //double temp as long as the doubled value does not exceed a
        while(a >= b){
            long temp = b;
            long multiple = 1;
        while((temp << 1) <= a){
            temp = temp << 1; //eg.,3 << 1 = 6, 6 << 1 = 12
            //how many original divisors that represents eg, temp=6,multiple=2 => 6=3*2
            multiple = multiple << 1;
        }
        a = a - temp;//eg, in 10/3,temp=6,multiple=2  10-6=4 remaining 4 
        quotient += multiple;//0+2=2
        }
        if(negative){
            quotient = -quotient;
        }
        if(quotient > Integer.MAX_VALUE){
            quotient = Integer.MAX_VALUE;
        }
        return (int)quotient;
    }
}