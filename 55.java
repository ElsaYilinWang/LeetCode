// Leetcode 55 Jump Game
// Reference: https://leetcode.com/problems/jump-game/solutions/3758301/java-easy-solution-with-explanation/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

class Solution {
    public boolean canJump(int[] nums) {

        int reachable = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > reachable) return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
        
    }
}