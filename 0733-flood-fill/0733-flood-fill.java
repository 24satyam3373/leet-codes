class Solution {

    public void dfs(int[][] image, int sr, int sc,
                    int newColor, int orgColor) {

        
        if (sr < 0 || sc < 0 ||                         // Boundary + invalid checks
            sr >= image.length ||
            sc >= image[0].length ||
            image[sr][sc] == newColor ||
            image[sr][sc] != orgColor) {

            return;
        }

        // Change color
        image[sr][sc] = newColor;

        dfs(image, sr - 1, sc, newColor, orgColor); // top
        dfs(image, sr, sc + 1, newColor, orgColor); // right
        dfs(image, sr + 1, sc, newColor, orgColor); // bottom
        dfs(image, sr, sc - 1, newColor, orgColor); // left
    }

    public int[][] floodFill(int[][] image,
                             int sr, int sc, int color) {

        int orgColor = image[sr][sc];

        dfs(image, sr, sc, color, orgColor);

        return image;
    }
}