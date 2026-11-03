class Solution {
    public int minMoves(int[] nums) {
        //[2,1,3] max = 3
        //2->3 = 1 move, 1->3 = 2 moves, 3->3 = 0 moves
        int max = nums[0];
        int moves = 0;
        //find max num
        for(int num:nums){
            max = Math.max(max,num);
        }
        //calculate moves
        for(int num:nums){
            moves += max - num;
        }
        return moves;
    }
}