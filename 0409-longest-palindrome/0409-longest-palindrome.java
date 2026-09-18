class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            if (++count[s.charAt(i)] % 2 == 0) {
                length += 2;
            }
        }

        return length < s.length() ? length + 1 : length;
    }
}