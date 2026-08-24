class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary =new StringBuilder();
        for(char c : s.toCharArray()){
            String bin =String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            binary.append(bin);
        }
        String str =binary.toString();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}