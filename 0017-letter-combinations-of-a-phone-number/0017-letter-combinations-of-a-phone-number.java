import java.util.*;

class Solution {
    final static char[][] L = {
        {}, {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };

    public List<String> letterCombinations(String D) {
        List<String> ans = new ArrayList<>();

        if (D.length() == 0)
            return ans;

        bfs(0, D, new StringBuilder(), ans);
        return ans;
    }

    private void bfs(int pos, String D, StringBuilder sb, List<String> ans) {
        if (pos == D.length()) {
            ans.add(sb.toString());
            return;
        }

        char[] letters = L[D.charAt(pos) - '0'];

        for (char c : letters) {
            sb.append(c);
            bfs(pos + 1, D, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}