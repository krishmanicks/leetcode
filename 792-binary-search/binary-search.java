class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int med = (low + high) / 2;
            
            if (nums[med] == target) {
                return med;
            }

            if (nums[med] > target) {
                high = med - 1;
            } else {
                low = med + 1;
            }
        }

        return -1;
        
    }
}