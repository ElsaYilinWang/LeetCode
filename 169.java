// Leetcode 169 Majority Element
//Reference: https://www.youtube.com/watch?v=wD7fs5P_MVo

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], vote = 1;

        for(int i = 1; i < nums.length; i++){

            if(vote == 0){
                majority = nums[i];
                vote ++;
            } 
            
            if(majority == nums[i]){
                vote ++;

            } else {
                vote --;
            }
        }
        return majority;
        
    }
}