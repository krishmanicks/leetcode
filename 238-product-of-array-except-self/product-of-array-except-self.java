class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] ans = new int[nums.length];
        int prod = nums[0];
        res[0] = prod;
        for (int i=1;i<nums.length;i++) {
            res[i] = prod * nums[i];
            prod = res[i];
        }

        prod = nums[nums.length - 1];
        left[nums.length-1] = prod;
        for (int i = nums.length - 2;i >=0; i--) {
            left[i] = prod * nums[i];
            prod = left[i];
        }

        for (int i=0;i<nums.length;i++) {
            if (i == 0) {
                ans[i] = left[i+1];
            }
            else if(i == nums.length - 1) {
                ans[i] = res[i-1]; 
            } else {
                ans[i] = left[i+1] * res[i-1];
            }
        }

        return ans;
    }
}