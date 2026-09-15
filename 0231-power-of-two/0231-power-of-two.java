class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;// n=16,n-1=15, 10000 & 01111 = 000000 
    }
}