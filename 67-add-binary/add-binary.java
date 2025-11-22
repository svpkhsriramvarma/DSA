class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sr = new StringBuilder("");
        int i = a.length()-1,j = b.length()-1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? a.charAt(i--)-'0' : 0;
            int digit2 = j >= 0 ? b.charAt(j--)-'0' : 0;

            int sum = digit1+digit2+carry;
            sr.append(sum%2);
            carry = sum/2;
        }
        return sr.reverse().toString();
    }
}