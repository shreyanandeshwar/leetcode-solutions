class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(left < right && !Character.isLetter(arr[left])){
            left++;//if not a letter
            }
            while(left < right && !Character.isLetter(arr[right])){
            right--;//if not a letter
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}