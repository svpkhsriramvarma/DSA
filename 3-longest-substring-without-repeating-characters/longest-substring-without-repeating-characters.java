class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int min = Integer.MIN_VALUE;
        int left = 0,right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(map.containsKey(ch)) {
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            min = Math.max(min,right-left+1);
            right++;
        }
        return min;
    }
}