package _530;

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
    private int prev = -1;
    private int answer = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root.left != null) {
            getMinimumDifference(root.left);
        }

        if (prev != -1) {
            answer = Math.min(answer, root.val - prev);
        }
        
        prev = root.val;

        if (root.right != null) {
            getMinimumDifference(root.right);
        }
        return answer;
    }
}