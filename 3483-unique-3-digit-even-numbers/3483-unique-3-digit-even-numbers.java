class Solution {
    public int totalNumbers(int[] d) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < d.length; i++)
            for (int j = 0; j < d.length; j++)
                for (int k = 0; k < d.length; k++)
                    if (i != j && j != k && i != k &&
                        d[i] != 0 && d[k] % 2 == 0)
                        set.add(d[i] * 100 + d[j] * 10 + d[k]);

        return set.size();
    }
}