// LeetCode 26 Remove Duplicated from Sorted Array
// Reference: https://www.youtube.com/watch?v=zIHe2V5Py3U

class Solution{
    public int removeDuplicates(int[] nums){

        int index = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i + 1]){
                nums[index++] = nums[i + 1];
            }
        }
        return index;

    }
}