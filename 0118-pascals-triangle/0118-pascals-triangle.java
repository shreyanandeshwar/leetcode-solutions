class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //generate numRows rows
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            //every row starts and ends with 1
            //first value
            row.add(1);
            //add the middle values
            if(i > 0){
                List<Integer> prev = result.get(i-1);
                for(int j=1;j<i;j++){
                    row.add(prev.get(j-1) + prev.get(j));
                }
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}