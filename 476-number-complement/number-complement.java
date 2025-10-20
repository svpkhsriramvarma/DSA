class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder res = new StringBuilder("");
        for(char ch : str.toCharArray()) {
            if(ch == '0') {
                res.append('1');
            } else {
                res.append('0');
            }
        }
        return Integer.parseInt(res.toString(),2);
    }
}