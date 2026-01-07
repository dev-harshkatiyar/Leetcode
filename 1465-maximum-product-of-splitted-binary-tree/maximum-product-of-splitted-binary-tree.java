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
    long max=Long.MIN_VALUE;
    int mod=1000000007;
     public int maxProduct(TreeNode root) {
        long sum=totalsum(root);
        dfs(root,sum);
        return (int) (max%mod);
    }
    public long dfs(TreeNode root,long sum){
        if(root==null) return 0;
        long left=dfs(root.left,sum);
        long right=dfs(root.right,sum);
        long currsum=left+right+root.val;
        max=Math.max(max,(sum-currsum)*currsum);
        return currsum;
    }
    public long totalsum(TreeNode root){
        if(root==null) return 0;
        long left=totalsum(root.left);
        long right=totalsum(root.right);
        return left+right+root.val;
    }
}