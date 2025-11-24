class Solution {
    public String minWindow(String s, String t) {
        int arr[] = new int[256];
        int n = s.length(),m = t.length();
        int siIdx = -1,minLen = Integer.MAX_VALUE;
        int right = 0,left = 0;
        int count = m;

        for(char ch : t.toCharArray()) {
            arr[ch]++;
        }

        while(right < n) {
            char ch = s.charAt(right);
            if(arr[ch] > 0) {
                count--;
            }
            arr[ch]--;

            while(count == 0) {
                if(right-left+1 < minLen) {
                    minLen = right-left+1;
                    siIdx = left;
                }
                char leftChar = s.charAt(left);
                arr[leftChar]++;
                if(arr[leftChar] > 0) {
                    count++;
                }
                left++;

            }
            right++;
        }

        return siIdx == -1 ? "" : s.substring(siIdx,siIdx+minLen);
    }
}