package _1008;

import util.TreeNode;

import java.util.Stack;

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode temp = stack.peek();
            int n = preorder[i];
            if (n < temp.val) {
                temp.left = new TreeNode(n);
                stack.push(temp.left);
            } else {
                TreeNode prev = stack.pop();
                while (!stack.isEmpty() && stack.peek().val < n) {
                    prev = stack.pop();
                }
                prev.right = new TreeNode(n);
                stack.push(prev.right);
            }
        }
        return root;
    }
}