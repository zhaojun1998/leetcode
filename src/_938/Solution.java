package _938;

import util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int i = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        
        if (root.val > L && root.left != null) {
            rangeSumBST(root.left, L, R);
        }
        
        if (root.val >= L && root.val <= R) {
            i += root.val;
        }
        
        if (root.val < R && root.right != null) {
            rangeSumBST(root.right, L, R);
        }
        
        return i;
    }
}