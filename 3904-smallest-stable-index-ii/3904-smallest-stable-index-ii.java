class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length, min = nums[n - 1], max = nums[0];

        int[] suf = new int[n];
        for (int i = n - 1; i >= 0; i--)
            suf[i] = min = Math.min(min, nums[i]);

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (max - suf[i] <= k) return i;
        }

        return -1;
    }
}