package _338;

class Solution {
    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i >> 1];
            } else {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr;
    }
}