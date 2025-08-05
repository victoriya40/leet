 class Solution {
public:
    void dfs(vector<vector<int>>& image, int r, int c, int originalColor, int newColor) {
        // Base case: boundary or color mismatch
        if (r < 0 || r >= image.size() || c < 0 || c >= image[0].size() || image[r][c] != originalColor)
            return;
        // Change current pixel to new color
        image[r][c] = newColor;
        // Visit 4-connected neighbors
        dfs(image, r + 1, c, originalColor, newColor);
        dfs(image, r - 1, c, originalColor, newColor);
        dfs(image, r, c + 1, originalColor, newColor);
        dfs(image, r, c - 1, originalColor, newColor);
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        // If the color is the same, no need to do anything
        if (originalColor == color)
            return image;
        dfs(image, sr, sc, originalColor, color);
        return image;
    }
};