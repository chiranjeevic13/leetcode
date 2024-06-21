class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            while(nums[i]!=0){
                sum2+=nums[i]%10;
                nums[i]/=10;
            }
        }
        if(sum1>sum2){
            return sum1-sum2;
        }
        else{
            return sum2-sum1;
        }
    }
}