class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] a = new boolean[n];
        int count = n / 2;

        for (int i = 3; i * i < n; i += 2)
            if (!a[i])
                for (int j = i * i; j < n; j += 2 * i)
                    if (!a[j]) {
                        a[j] = true;
                        count--;
                    }

        return count;
    }
}