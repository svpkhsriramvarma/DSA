class Solution {
    public static void solve(String s, int i, StringBuilder ans, List<String> list) {
        if (i == s.length()) {
            list.add(ans.toString());
            return;
        }
        char ch = s.charAt(i);
        if (Character.isDigit(ch)) {
            ans.append(ch);
            solve(s, i + 1, ans, list);
            ans.deleteCharAt(ans.length() - 1);
        } else {
            ans.append(Character.toLowerCase(ch));
            solve(s, i + 1, ans, list);
            ans.deleteCharAt(ans.length() - 1);
            ans.append(Character.toUpperCase(ch));
            solve(s, i + 1, ans, list);
            ans.deleteCharAt(ans.length() - 1);
        }
    }

    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        solve(s, 0, new StringBuilder(), list);
        return list;
    }
}
