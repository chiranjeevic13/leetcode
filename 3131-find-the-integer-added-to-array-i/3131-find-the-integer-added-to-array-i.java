class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum=0,sum1=0;
        for(int n:nums1){
            sum+=n;
        }
        for(int m:nums2){
            sum1+=m;
        }
       int res=(sum1-sum)/(nums1.length);
       return res;
    }
}