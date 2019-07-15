package _461;

class Solution {

    public int hammingDistance(int x, int y) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((x & 1) != (y & 1)) {
                res++;
            }
            x >>= 1;
            y >>= 1;
        }
        
        return res;
    }

    public int hammingDistance2(int x, int y) {
        int res = 0;

        int z = x ^ y;

        while (z != 0) {
            z = z & (z - 1);
            res++;
        }

        return res;
    }
}