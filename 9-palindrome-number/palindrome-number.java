class Solution {
    public static int reverse(int n) {
        int val = 0;
        while(n != 0) {
            int digit = n % 10;
            n /= 10;
            val = val*10+digit;
        }
        return val;
    }
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int reValue = reverse(x);
        return x == reValue;
    }
}