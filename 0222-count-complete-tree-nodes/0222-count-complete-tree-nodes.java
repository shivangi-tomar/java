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
 public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int height = getHeight(root);
        if (height == 0) return 1;

        int left = 0, right = (int) Math.pow(2, height) - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nodeExists(mid, height, root)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) Math.pow(2, height) - 1 + left;
    }

    private int getHeight(TreeNode node) {
        int height = 0;
        while (node.left != null) {
            node = node.left;
            height++;
        }
        return height;
    }

    private boolean nodeExists(int index, int height, TreeNode node) {
        int left = 0, right = (int) Math.pow(2, height) - 1;
        for (int i = 0; i < height; i++) {
            int mid = left + (right - left) / 2;
            if (index <= mid) {
                node = node.left;
                right = mid;
            } else {
                node = node.right;
                left = mid + 1;
            }
            if (node == null) return false;
        }
        return true;
    }
}