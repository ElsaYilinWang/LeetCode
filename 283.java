//LeetCode 283 Move Zeroes
// Reference: https://www.youtube.com/watch?v=k5lIW5XxC7g

// Time Complexity is O(N) and Space Complexity is O(1)
class Solution{
    public void moveZeroes(int[] nums){
        // Start with the first position
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++){
            //Move all non-zero integers to left side
            if(nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition ++;
            }
        }

        while (insertPosition < nums.length){
            nums[insertPosition ++] = 0;
        }
    }

}

