class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int sum = 0;

        while(i < j) {
            int currentSum = (j - i) * (Math.min(heights[i], heights[j]));
            if(currentSum > sum) {
                sum = currentSum;
            }
            if(heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return sum;
    }
}
