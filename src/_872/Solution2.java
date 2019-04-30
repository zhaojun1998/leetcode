package _872;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * 非递归写法:
 */
public class Solution2 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        pushLeafRoot(root1, list1);
        pushLeafRoot(root2, list2);
        return list1.equals(list2);
    }

    private void pushLeafRoot(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left == null && node.right == null) {
                list.add(node.val);
            }
        }
    }
}