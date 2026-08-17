class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            int frequency = entry.getValue();
            int number = entry.getKey();
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(number);
        }
        int count = 0;
        int[] result = new int[k];
        for(int frequency=nums.length;frequency>=1;frequency--){
            if(buckets[frequency]!=null){
                for(int number:buckets[frequency]){
                    if(count == k){
                    break;
                }
                    result[count] = number;
                    count++;
                }
            }
        }
        return result;
    }
}