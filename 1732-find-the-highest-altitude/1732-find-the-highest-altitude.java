class Solution {
    public int largestAltitude(int[] gain) {
        int len=gain.length;
        int highest=0;
        int res=0;
        for(int i=0;i<len;i++){
            res=res+gain[i];
            if(res>highest){
                highest=res;
            }
        }
        return highest;
    }
}