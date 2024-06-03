// LeetCode 80 Remove Duplicates from Sorted Array II
// Reference: https://www.youtube.com/watch?v=OZaADxYTfD4

class Solution {
    public int removeDuplicates(int[] nums) {
        // TIme O(N)
        // Spce O(1)
        int in = 2;

        if (nums.length < 3) return nums.length;

        for (int i = 2; i < nums.length; i++){
            if (nums[i] != nums[in-2]){
                nums[in] = nums[i];
                in ++;
            }
        }
        return in;
    }
}

