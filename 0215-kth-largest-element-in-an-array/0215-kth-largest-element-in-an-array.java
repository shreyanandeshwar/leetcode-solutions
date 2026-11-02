class Solution {
    public int findKthLargest(int[] nums, int k) { //k=2 -> find 2nd largest element
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}