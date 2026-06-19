import java.util.*;

public class TrappingRainWater {
    public static int trap(int[] heights) {
        int total = 0, leftMax = heights[0];
        int[] rightMax = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            if (i == heights.length - 1) {
                rightMax[i] = heights[i];
            } else {
                rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (i > 0 && leftMax < heights[i])
                leftMax = heights[i];

            if ((Math.min(leftMax, rightMax[i]) - heights[i]) > 0)
                total += Math.min(leftMax, rightMax[i]) - heights[i];

        }
        return total;
    }

    public static void main(String[] args) {
        int[] heights = { 0, 1, 0, 2, 1, 2, 3, 1, 2, 1, 2, 1 };
        int ans = trap(heights);
        System.out.println(ans);
    }
}
