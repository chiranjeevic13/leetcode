public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum = sum * 26 + (c - 'A'+1);
        }
        return sum;
    }
}
