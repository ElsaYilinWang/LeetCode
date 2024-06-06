// LeetCode 42 Trapping Rain Water
// Reference:https://leetcode.com/problems/trapping-rain-water/solutions/17414/a-stack-based-solution-for-reference-inspired-by-histogram/?envType=study-plan-v2&envId=top-interview-150

import java.util.Stack;

class Solution {
    public int trap(int[] height) {
        
        if (height == null || height.length < 2) return 0;

        Stack<Integer> stack = new Stack<>();
        int water = 0, i = 0;

        while (i < height.length){
            if (stack.isEmpty() || height[i] <= height[stack.peek()]){
                stack.push(i++);
            } else {
                int pre = stack.pop();
                if (!stack.isEmpty()){
                    // find the smaller height between the two sides
                    int minHeight = Math.min(height[stack.peek()], height[i]);
                    // calculate the area
                    water += (minHeight - height[pre]) * (i - stack.peek() - 1);
                }
            }
        }
        return water;
    }
}
