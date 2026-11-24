class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);
        while(left <= right){
            long sum = left * left + right * right;
            if(sum == c){
              return true;
            }
            else if(sum < c){
              left++;
            }
            else{
              right--;
            }
        }
        return false;
    }
}
//binary-search
// class Solution {
//     public boolean judgeSquareSum(int c) {

//         for (long a = 0; a * a <= c; a++) {

//             long remaining = c - a * a;

//             long left = 0;
//             long right = (long) Math.sqrt(remaining);

//             while (left <= right) {

//                 long mid = left + (right - left) / 2;
//                 long square = mid * mid;

//                 if (square == remaining) {
//                     return true;
//                 }
//                 else if (square < remaining) {
//                     left = mid + 1;
//                 }
//                 else {
//                     right = mid - 1;
//                 }
//             }
//         }

//         return false;
//     }
// }
