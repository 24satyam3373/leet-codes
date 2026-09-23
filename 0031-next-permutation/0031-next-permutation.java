class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Find the pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Swap with the next larger value
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Make the suffix as small as possible
        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}