class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        List<int[]> list = new ArrayList<>();   
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 0; i < n; i++) {

            int start = intervals[i][0];

            int end = intervals[i][0]; 
            end = intervals[i][1];

            if(!list.isEmpty() && end <= list.get(list.size()-1)[1])
                continue;

            for(int j = i+1; j < n; j++) {

                if(intervals[j][0] <= end)
                    end = Math.max(end, intervals[j][1]);
                else
                    break;
            }

            list.add(new int[]{start, end});
        }

        return list.toArray(new int[list.size()][]);
    }
}