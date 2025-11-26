class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int left = 0, right = 0, maxFreq = 0;
        int maxLen = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);
            arr[ch - 'A']++;
            maxFreq = Math.max(maxFreq, arr[ch - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                char c = s.charAt(left);
                arr[c - 'A']--;
                left++;

                maxFreq = 0;
                for (int j = 0; j < 26; j++) {
                    maxFreq = Math.max(maxFreq, arr[j]);
                }
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
