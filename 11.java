// LeetCode 11 Container with Most Water
// Reference: https://leetcode.com/problems/container-with-most-water/solutions/3701708/best-method-c-java-python-beginner-friendly/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int maxArea(int[] height) {
        // Two pointers
        int left = 0;
        int right = height.length - 1;
        // max area = most water
        int maxArea = 0;

        while (left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]){
                left --;
            } else {
                right --;
            }
        }
        return maxArea;
    }
}