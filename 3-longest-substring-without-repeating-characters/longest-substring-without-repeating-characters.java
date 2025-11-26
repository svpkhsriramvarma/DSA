class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0,right = 0,max = 0,n = s.length();

        while(right < n) {
            char ch = s.charAt(right);
            if(map.containsKey(ch)) {
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}