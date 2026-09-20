class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long size = (long) grid.length * grid.length;
        long sum = 0, squareSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                sum += num;
                squareSum += (long) num * num;
            }
        }

        long expectedSum = size * (size + 1) / 2;
        long expectedSquareSum = size * (size + 1) * (2 * size + 1) / 6;

        long difference = sum - expectedSum; // a - b
        long combined = (squareSum - expectedSquareSum) / difference; // a + b

        int repeated = (int) ((combined + difference) / 2);
        int missing = (int) ((combined - difference) / 2);

        return new int[]{repeated, missing};
    }
}