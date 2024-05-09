// Leetcode 27: Remove element
// Reference: https://leetcode.com/problems/remove-element/solutions/3102906/java-best-solution-o-n-time-complexity/?envType=study-plan-v2&envId=top-interview-150

// Time Complexity: O(n)
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}


