/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int count = 0;
    public static void solve(TreeNode root) {
        if(root == null)
            return;
        solve(root.left);
        count+=1;
        solve(root.right);
    }
    public int countNodes(TreeNode root) {
        count = 0;
        if(root == null)
            return 0;
        solve(root);
        return count;
    }
}