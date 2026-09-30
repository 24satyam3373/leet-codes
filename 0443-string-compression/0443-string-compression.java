class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char current = chars[read];
            int start = read;

            
            while (read < chars.length && chars[read] == current) {
                read++;
            }

            int count = read - start;
            chars[write++] = current;

            if (count > 1) {
               
                int digitStart = write;

                while (count > 0) {
                    chars[write++] = (char) ('0' + count % 10);
                    count /= 10;
                }

                int left = digitStart;
                int right = write - 1;

                while (left < right) {
                    char temp = chars[left];
                    chars[left++] = chars[right];
                    chars[right--] = temp;
                }
            }
        }

        return write;
    }
}