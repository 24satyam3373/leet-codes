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
    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    int[] dfs(TreeNode r) {
        if (r == null) return new int[]{0, 0};

        int[] l = dfs(r.left);
        int[] x = dfs(r.right);

        int sum = l[0] + x[0] + r.val;
        int cnt = l[1] + x[1] + 1;

        if (sum / cnt == r.val) ans++;

        return new int[]{sum, cnt};
    }
}