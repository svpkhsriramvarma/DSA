class Solution {
    public static void findLeftMax(long left[], int heights[]) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int top = st.pop();
                int prev = st.isEmpty() ? -1 : st.peek();
                sum -= (long)(heights[top] - heights[i]) * (top - prev);
            }
            sum += heights[i];
            left[i] = sum;
            st.push(i);
        }
    }

    public static void findRightMax(long right[], int heights[]) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        long sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int top = st.pop();
                int prev = st.isEmpty() ? n : st.peek();
                sum -= (long)(heights[top] - heights[i]) * (prev - top);
            }
            sum += heights[i];
            right[i] = sum;
            st.push(i);
        }
    }

    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long left[] = new long[n];
        long right[] = new long[n];
        findLeftMax(left, heights);
        findRightMax(right, heights);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, left[i] + right[i] - heights[i]);
        }
        return ans;
    }
}
