package _1022;

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
    
    int result = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    
    public void dfs(TreeNode node, int currentVal) {
        if (node != null) {
            currentVal <<= 1;
            currentVal += node.val;
            if (node.left == null && node.right == null) {
                result += currentVal;
            }
            dfs(node.left, currentVal);
            dfs(node.right, currentVal);
        }
    }
}