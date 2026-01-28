class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, maxArea = 0;

        while(left < right){
            int len = right - left;
            int hei = Math.min(height[left], height[right]);
            int area = len * hei;
            maxArea = Math.max(area, maxArea);

            if(height[left] > height[right]) right--;
            else left++;
        }

        return maxArea;
    }
}