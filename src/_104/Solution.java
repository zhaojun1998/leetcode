package _104;

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
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root, 0);
    }
    
    public int getMaxDepth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        depth++;
        int leftDepth = getMaxDepth(node.left, depth);
        int rightDepth = getMaxDepth(node.right, depth);
        
        return depth = leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}