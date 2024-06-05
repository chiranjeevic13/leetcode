public class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if((r-l+1)>maxLen){
                    res=s.substring(l,r+1);
                    maxLen=(r-l+1);
                }
            l--;
            r++;
            }

            int le=i;
            int re=i+1;
            while(le>=0 && re<s.length() && s.charAt(le)==s.charAt(re)){
                if((re-le+1)>maxLen){
                    res=s.substring(le,re+1);
                    maxLen=(re-le+1);
                }
            le--;
            re++;
            }


        }

        return res;
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}