class Solution {
    long totalSum = 0;
    long maxProduct = 0;
    final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        getSubtreeSum(root);
        return (int)(maxProduct % MOD);
    }

    private long getTotalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getTotalSum(node.left) + getTotalSum(node.right);
    }

    private long getSubtreeSum(TreeNode node) {
        if (node == null) return 0;

        long left = getSubtreeSum(node.left);
        long right = getSubtreeSum(node.right);

        long subSum = node.val + left + right;
        long product = subSum * (totalSum - subSum);

        maxProduct = Math.max(maxProduct, product);
        return subSum;
    }
}
