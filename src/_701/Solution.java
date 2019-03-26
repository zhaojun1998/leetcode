package _701;

import util.TreeNode;

class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            throw new IllegalArgumentException("Tree Root can not be empty");
        }
        TreeNode current = root;

        TreeNode preNode = null;
        while (current != null) {
            preNode = current;
            if (current.val < val) {
                current = current.right;
            } else if (current.val > val){
                current = current.left;
            }
        }

        if (preNode.val < val) {
            preNode.right = new TreeNode(val);
        } else {
            preNode.left = new TreeNode(val);
        }

        return root;
    }
}