class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i = 0,j = 0;
        StringBuilder sr = new StringBuilder("");
        while(i < n && j < m) {
            sr.append(word1.charAt(i++));
            sr.append(word2.charAt(j++));
        }
        while(i < n) {
            sr.append(word1.charAt(i++));
        }
        while(j < m) {
            sr.append(word2.charAt(j++));
        }
        return new String(sr);
    }
}