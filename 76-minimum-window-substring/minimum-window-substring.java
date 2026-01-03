class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(),m = t.length();
        int arr[] = new int[256];
        int stIdx = -1,minLen = Integer.MAX_VALUE,count = m;
        int right = 0,left = 0;

        for(char c : t.toCharArray()) {
            arr[c-'A']++;
        }

        while(right < n) {
            char ch = s.charAt(right);
            if(arr[ch-'A'] > 0)
                count--;
            arr[ch-'A']--;

            while(count == 0) {
               if(right-left+1 < minLen) {
                stIdx = left;
                minLen = Math.min(minLen,right-left+1);
               }
               char c = s.charAt(left);
               arr[c-'A']++;
               if(arr[c-'A'] > 0)
                count++;
                left++;
            }
            right++;
        }

        return stIdx == -1 ? "" : s.substring(stIdx,stIdx+minLen);
    }
}