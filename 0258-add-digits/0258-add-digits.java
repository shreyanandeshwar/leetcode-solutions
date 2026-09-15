class Solution {
    public int addDigits(int num) {
       if(num == 0){
        return 0;
       }
       return 1 + (num - 1) % 9;//1+(38-1)%9 = 1+37%9 = 1+1 = 2
    }
}