class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //k -> difference between 2 indices of same number i < k
        Set<Integer> set = new HashSet<>();
        for(int i=0;i < nums.length;i++){
            //sliding window 
            //maintain the window size
            if(i > k){
            set.remove(nums[i-k-1]);
             }
            if(set.contains(nums[i])){
            return true;
             }
             set.add(nums[i]);
        }
        return false;
    }
}