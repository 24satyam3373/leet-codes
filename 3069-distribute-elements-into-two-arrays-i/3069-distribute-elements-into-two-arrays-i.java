class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a = new ArrayList<>(), b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);

        for (int i = 2; i < nums.length; i++)
            (a.get(a.size()-1) > b.get(b.size()-1) ? a : b).add(nums[i]);

        a.addAll(b);
        return a.stream().mapToInt(x -> x).toArray();
    }
}