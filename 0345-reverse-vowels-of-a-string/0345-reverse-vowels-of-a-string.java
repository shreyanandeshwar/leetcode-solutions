class Solution {
    public String reverseVowels(String s) {
        //modify individual characters
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        //two pointer
        while(left < right){
            if(!isVowel(chars[left])){
                left++;
                continue;
            }
            if(!isVowel(chars[right])){
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}