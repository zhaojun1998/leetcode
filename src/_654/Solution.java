package _654;

import util.TreeNode;

import java.util.Arrays;

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            if (num > max) {
                max = num;
                maxIndex = i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, maxIndex));
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, maxIndex + 1, len));
        return node;
    }
}
