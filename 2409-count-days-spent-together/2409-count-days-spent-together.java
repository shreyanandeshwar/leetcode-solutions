class Solution {
    private int getDay(String date, int[] days){
        //convert characters from mm-dd into integers
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));
        //add the days from previous months
        int total = day;
        for(int i=0;i<month-1;i++){
            total += days[i];
        }
        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};//days per month jan-dec
        int aliceStart = getDay(arriveAlice, days);
        int aliceEnd = getDay(leaveAlice, days);
        int bobStart = getDay(arriveBob, days);
        int bobEnd = getDay(leaveBob, days);
        //overlapping period
        //overlap starts at later starting date
        int start = Math.max(aliceStart, bobStart);
        //overlap ends at earlier ending date
        int end = Math.min(aliceEnd, bobEnd);
        //no overlap
        if(start > end){
            return 0;
        }
        return end - start + 1;
    }
}