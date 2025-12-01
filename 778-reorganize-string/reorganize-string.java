class Solution {
    public String reorganizeString(String s) {
        int arr[] = new int[26];
        for(char ch : s.toCharArray()) {
            arr[ch-'a']++;
        }

        int max = 0;
        int letter = 0;
        for(int i = 0;i < 26;i++) {
            if(max < arr[i]) {
                max = arr[i];
                letter = i;
            }
        }

        if(max > (s.length()+1)/2) return "";

        char ch[] = new char[s.length()];
        int idx = 0;
        while(arr[letter]-- > 0) {
            ch[idx] = (char) (letter+'a');
            idx += 2;
        }

        for(int i = 0;i < 26;i++) {
            while(arr[i]-- > 0) {
                 if(idx >= s.length()) idx = 1;
                ch[idx] = (char) (i+'a');
                idx += 2;
            }
        }

        return new String(ch);
    }
}