class Solution {
    public boolean checkIfExist(int[] arr) {
        /*for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;*/
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
        //check whether double the curr no present or whether the curr no is even & its half is already present
            if(set.contains(num * 2)||(num % 2 == 0 && set.contains(num/2))){
                return true;
            }
            //if not present add no
            set.add(num);
        }
        return false;
    }
}