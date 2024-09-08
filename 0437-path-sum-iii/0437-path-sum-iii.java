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
    private int cnt;
    
    public int pathSum(TreeNode root, int sum) {
        cnt = 0;
        find(root, sum);
        return cnt;
    }
    
    private void find(TreeNode root, int sum){
        if (root == null) return;
        path(root, sum);
        find(root.left, sum);
        find(root.right, sum);
    }
    
    private void path(TreeNode root, int sum){
        
        if (root == null) return;
        if (sum - root.val == 0) cnt++;
        path(root.left, sum - root.val);
        path(root.right, sum - root.val);
    }
}