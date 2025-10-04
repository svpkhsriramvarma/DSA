class Solution {
    public String minWindow(String s, String t) {
        int arr[] = new int[256];
        int m = s.length(), n = t.length();
        int minLen = Integer.MAX_VALUE, stIdx = -1;
        int left = 0, right = 0, count = n;

        for (char ch : t.toCharArray()) {
            arr[ch]++;
        }

        while (right < m) {
            char ch = s.charAt(right);
            if (arr[ch] > 0) {
                count--;
            }
            arr[ch]--;

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    stIdx = left;
                }

                char leftChar = s.charAt(left);
                arr[leftChar]++;
                if (arr[leftChar] > 0) {
                    count++;
                }
                left++;
            }

            right++;
        }

        return stIdx == -1 ? "" : s.substring(stIdx, stIdx + minLen);
    }
}
