class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            ar.add(index[i], nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ar.get(i);
        }
        return nums;
    }
}