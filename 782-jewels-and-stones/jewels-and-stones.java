class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int arr[] = new int[256];
        for(char ch : stones.toCharArray())
           arr[ch]++;
        int count = 0;
        for(char ch : jewels.toCharArray()) {
            count += arr[ch];
        }
        return count;
    }
}