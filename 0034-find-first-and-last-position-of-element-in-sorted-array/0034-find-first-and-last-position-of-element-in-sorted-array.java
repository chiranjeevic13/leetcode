class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l <= h){
            int mid = (l+h)/2;            
            if(nums[mid] == target){
                if(nums[l] == target && nums[h] == target){
                    return new int[]{l,h};
                }
                if(nums[l] < target){
                    l++;
                }
                if(nums[h] > target){
                    h--;
                }
            } 
            else if(target < nums[mid]){
                h = mid-1;
            } 
            else {
                l = mid+1;
            }
        }
        return new int[]{-1,-1};   
    }
}