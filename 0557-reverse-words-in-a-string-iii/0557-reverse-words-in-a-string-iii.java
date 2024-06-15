public class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }
}
