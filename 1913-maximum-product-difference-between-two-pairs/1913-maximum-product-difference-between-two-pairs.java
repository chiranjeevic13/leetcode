class Solution {
    public int maxProductDifference(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int mul1=nums[(n-1)]*nums[(n-2)];
       int mul2=nums[(n-n)]*nums[(n-n+1)];
       int res=mul1-mul2;
    
    
    return res;
    }
}