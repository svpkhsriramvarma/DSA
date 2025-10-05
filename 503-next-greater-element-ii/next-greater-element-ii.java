import java.util.*;

class Solution {
    public static int findMax(int nums[], int val) {
        for (int i = 0; i < nums.length; i++) {
            if (val < nums[i])
                return nums[i];
        }
        return -1;
    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[nums.length];

        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int idx = i % nums.length;
            while (!st.isEmpty() && nums[idx] >= st.peek())
                st.pop();

            if (i < nums.length) {
                arr[idx] = st.isEmpty() ? findMax(nums, nums[idx]) : st.peek();
            }

            st.push(nums[idx]);
        }

        return arr;
    }
}
