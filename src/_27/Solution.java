package _27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] == val && i < len) {
                nums[i] = nums[--len];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {8, 8, 9, 8, 9, 6, 3, 5};
        int val = 8;
        System.out.println(new Solution().removeElement(nums, val));
    }
}