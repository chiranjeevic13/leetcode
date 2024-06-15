class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] arr=s.split(" ");
        for(int j=0;j<arr.length;j++){
        for (int i = arr[j].length() - 1; i >= 0; i--) {
            res += arr[j].charAt(i);
        }
            if (j != arr.length-1) {
                res += " ";
            }
        }
        return res;
    }
}