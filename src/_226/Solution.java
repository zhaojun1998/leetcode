package _226;

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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left != null) {
            invertTree(left);
        }
        if (right != null) {
            invertTree(right);
        }
        
        root.left = right;
        root.right = left;
        
        return root;
    }
}