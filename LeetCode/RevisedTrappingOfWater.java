public class RevisedTrappingOfWater {
    public static int get(int[] heights) {
        int max = 0;
        int left = 0, right = heights.length - 1, leftMax = heights[left], rightMax = heights[right];

        while (left < right) {
            if (heights[left] < heights[right]) {
                // jab leftMax is min
                if (leftMax < heights[left])
                    leftMax = heights[left];
                else
                    max += leftMax - heights[left];
                left++;
            } else {
                if (rightMax < heights[right])
                    rightMax = heights[right];
                else
                    max += rightMax - heights[right];
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = { 0, 1, 0, 2, 1, 2, 3, 1, 2, 1, 2, 1 };
        int ans = get(heights);
        System.out.println(ans);
    }
}
