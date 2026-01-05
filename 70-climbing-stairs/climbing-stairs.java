class Solution {
    public int climbStairs(int n) {
        
        int i = 0;
        int j = 1;

        while(n>0) {
            int k = i + j;
            i = j;
            j = k;
            n--;
        }

        return j;
    }
}