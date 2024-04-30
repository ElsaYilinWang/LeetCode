// LeetCode 287: Find the Duplicate Number
// Reference: https://leetcode.com/problems/find-the-duplicate-number/solutions/4062178/two-pointer-solution-with-floyd-s-tortoise-and-hare-algorithm-python-javascript-java-and-c/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast){
                break;
            }
        }

        int slow2 = nums[0];
        while (slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
    }
}

