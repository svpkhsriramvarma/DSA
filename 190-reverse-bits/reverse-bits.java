class Solution {
    public int reverseBits(int n) {
        int reverse = 0;
        for(int i = 0;i < 32;i++) {
            int digit = n & 1;
            reverse = (reverse << 1) | digit;
            n >>>= 1;
        }
        return reverse;
    }
}