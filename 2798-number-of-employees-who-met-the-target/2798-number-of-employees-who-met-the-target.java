class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        int len=hours.length;
        for(int i=0;i<len;i++){
                if(hours[i]>=target){
                    count++;
                }
            }
        return count;
    }
}