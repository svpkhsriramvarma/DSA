class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, max = Integer.MIN_VALUE;
        while (right < s.length()) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.get(ch) > 1) {
                while (map.get(ch) > 1) {
                    char c = s.charAt(left);
                    map.put(c, map.get(c) - 1);
                    left++;
                }
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}