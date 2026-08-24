class Solution {
    public int maxProduct(int[] nums) {
        int high = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                high=Math.max(high,(nums[i]-1)*(nums[j]-1));
            }
        }
        return high;
    }
}