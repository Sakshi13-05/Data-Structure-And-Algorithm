package Array_Restart_071026;

class SolutionOfMostWater {
    public int maxArea(int[] heights) {
        int max = 0, new_max = 0, l = 0, r = heights.length - 1;
        while (l < r) {
            max = Math.min(heights[l], heights[r]) * (r - l);
            if (max > new_max) {
                new_max = max;
            }
            if (heights[l] > heights[r])
                r--;
            else if (heights[l] < heights[r])
                l++;
            else {
                l++;
                r--;
            }
        }

        return new_max;
    }

}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        SolutionOfMostWater s1 = new SolutionOfMostWater();
        int max = s1.maxArea(heights);
        System.out.println(max);
    }
}
