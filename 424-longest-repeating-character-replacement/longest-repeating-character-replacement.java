class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int maxFreq = 0,left = 0,right = 0,maxLen = 0;
        while(right < s.length()) {
            char ch = s.charAt(right);
            arr[ch-'A']++;
            maxFreq = Math.max(maxFreq,arr[ch-'A']);
            while(right-left+1-maxFreq > k) {
                char c = s.charAt(left);
                left++;
                arr[c-'A']--;

                for(int i = 0;i < 26;i++) {
                    maxFreq = Math.max(maxFreq,arr[i]);
                }
            }
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}