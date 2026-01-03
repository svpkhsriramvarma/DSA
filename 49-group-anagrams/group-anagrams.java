class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String sr = new String(arr);
            map.putIfAbsent(sr,new ArrayList<>());
            map.get(sr).add(s);
        }

        List<List<String>> list = new ArrayList<>();
        for(String s : map.keySet()) {
            list.add(map.get(s));
        }
        return list;
    }
}