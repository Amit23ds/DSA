class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] >= (i < n ? heights[i] : 0))) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int n=matrix.length;
        int m=matrix[0].length;
        int[] height = new int[m];
        int maxArea = 0;
        for (char[] row : matrix) {
            for (int i = 0; i < m; i++) {
                if (row[i] == '1') height[i]++;
                else height[i] = 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }

        return maxArea;

    }
}