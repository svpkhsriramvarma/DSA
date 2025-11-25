class Solution {
    
    private boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }

    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z')
            return (char)(c + 32);
        return c;
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left <= right) {
            while (left < right && !isAlphaNum(s.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphaNum(s.charAt(right))) {
                right--;
            }

            if (toLower(s.charAt(left)) != toLower(s.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
