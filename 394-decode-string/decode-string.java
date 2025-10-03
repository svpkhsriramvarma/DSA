class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        String result = "";
        String n = "";

        for(char ch : s.toCharArray()) {
            if(ch == '[') {
                st.push(result);
                st.push(n);
                result = "";
                n = "";
            } else if(ch == ']') {
                String stNum = st.pop();
                int num = Integer.parseInt(stNum);
                String prevString = st.pop();
                StringBuilder str = new StringBuilder("");
                for(int i = 0;i< num;i++) {
                    str.append(result);
                }
                result = prevString+str;
            } else if(Character.isDigit(ch)) {
                n += ch;
            } else {
                result += ch;
            }
        }

        return result;
    }
}