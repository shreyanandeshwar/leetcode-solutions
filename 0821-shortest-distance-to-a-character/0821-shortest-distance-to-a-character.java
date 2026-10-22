class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] answer = new int[s.length()];
        int prev = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                prev = i;
            }
            if(prev != -1){
                answer[i] = i - prev;
            }
            else{
                answer[i] = Integer.MAX_VALUE;
            }
        }
        prev = -1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == c){
                prev = i;
            }
            if(prev != -1){
                int distance = prev-i;
                answer[i] = Math.min(answer[i], distance);
            }
        }
        return answer;
    }
}