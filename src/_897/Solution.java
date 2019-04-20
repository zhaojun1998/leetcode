package _897;

import sun.reflect.generics.tree.Tree;
import util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    private TreeNode result = new TreeNode(0);
    private TreeNode dummy = result;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        increasingBST(root.left);
        dummy.right = new TreeNode(root.val);
        dummy = dummy.right;
        increasingBST(root.right);
        return result.right;
    }
}