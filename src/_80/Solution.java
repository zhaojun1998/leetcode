package _80;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k] || k == 0 || (nums[i] == nums[k] && nums[i] != nums[k - 1])) {
                nums[++k] = nums[i];
            }
        }
        return k + 1;
    }
}