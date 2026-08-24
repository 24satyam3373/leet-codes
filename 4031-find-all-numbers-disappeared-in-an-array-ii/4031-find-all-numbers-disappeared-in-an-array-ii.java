class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int[] zelvoranki = nums;  

        Set<Integer> present = new HashSet<>();
        for (int num : zelvoranki) {
            present.add(num);
        }

        List<List<Integer>> result = new ArrayList<>();
        Integer start = null;

        for (int i = lower; i <= upper; i++) {
            if (!present.contains(i)) {
                if (start == null) start = i;  
            } else {
                if (start != null) {
                    result.add(Arrays.asList(start, i - 1));
                    start = null;
                }
            }
        }

        if (start != null) {
            result.add(Arrays.asList(start, upper));
        }

        return result;
    }
}