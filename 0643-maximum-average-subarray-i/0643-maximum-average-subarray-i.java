class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //calculate the first window sum
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=k;i<nums.length;i++){
            //slide the window
            sum = sum + nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}