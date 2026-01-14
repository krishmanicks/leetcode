class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();

        int max = 0;
        for(int num: nums) {
            map.put(num, false);
        }

        for(int num: nums) {
            int currLength = 1;
            int next = num + 1;

            while(map.containsKey(next) && map.get(next) == false) {
                currLength++;
                map.put(next, true);
                next++;
            }

            int prev = num - 1;
            while(map.containsKey(prev) && map.get(prev) == false ) {
                currLength++;
                map.put(prev, true);
                prev--;
            }

            max = Math.max(max, currLength);
        }

        return max;
    }
}