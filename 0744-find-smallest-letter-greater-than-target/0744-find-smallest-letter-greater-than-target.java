class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(letters[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        //[c,f,j]->target = c, left=1, letters[1%3]=letters[1]=f
        return letters[left % letters.length];
    }
}