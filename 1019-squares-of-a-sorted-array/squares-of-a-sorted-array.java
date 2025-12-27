class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int h = nums.length;

        for (int i=0;i<h;i++) {
            nums[i] = nums[i] * nums[i];
        }

        int[] res = new int[h];
        int pos = h - 1;

        for (int i = h-1;i>=0;i--) {
            if (nums[l] > nums[pos]) {
                res[i] = nums[l];
                l++;
            } else {
                res[i] = nums[pos];
                pos--;
            }
        }
            return res;
    }
}