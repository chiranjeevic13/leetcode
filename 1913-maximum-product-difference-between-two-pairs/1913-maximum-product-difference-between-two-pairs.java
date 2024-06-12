class Solution {
    public int maxProductDifference(int[] nums) {
        int big1 = 0, big2 = 0;
        int small1 = Integer.MAX_VALUE, small2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < small1) {
                small2 = small1;
                small1 = n;
            } else if (n < small2) {
                small2 = n;
            }

            if (n > big1) {
                big2 = big1;
                big1 = n;
            } else if (n > big2) {
                big2 = n;
            }
        }

        return big1 * big2-small1 * small2;        
    }
}