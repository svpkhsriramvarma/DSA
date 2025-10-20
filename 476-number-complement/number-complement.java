class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String res ="";
        for(char ch : str.toCharArray()) {
            if(ch == '0') {
                res += '1';
            } else {
                res += '0';
            }
        }
        return Integer.parseInt(res,2);
    }
}