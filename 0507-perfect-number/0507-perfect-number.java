class Solution {
    public boolean checkPerfectNumber(int num) {
      if(num <= 1){
        return false;
      }
      int ans = 1;
      for(int i=2; i*i<=num; i++){ //check upto square root of num eg,for 28 = 5.29..
        if(num % i == 0){
            if(i*i == num){
                ans += i;
            }
            else{
                ans += i + num/i; //eg, i=2, ans += 2 + 28/2
            } 
        }
      }
      return ans == num;
    }
}