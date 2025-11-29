class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for(char ch : stones.toCharArray()){
            if(jewels.contains(ch+"")) ans++;
        }
        return ans;
    }
}