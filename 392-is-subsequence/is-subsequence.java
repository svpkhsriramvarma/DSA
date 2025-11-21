class Solution {
    public boolean isSubsequence(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i = 0;
        for(char ch : t.toCharArray()) {
            if(i < s.length() && s.charAt(i) == ch) {
                map.put(ch,map.get(ch)-1);
                i++;
            }
        }

        for(char ch : s.toCharArray()) {
            if(map.get(ch) != 0)
                return false;
        }
        return true;
    }
}