// LeetCode 26 Remove Duplicated from Sorted Array
// Reference:https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/4141891/beats-100-c-java-python-javascript-ruby-c-o-n-solution-detailed-explanation/?envType=study-plan-v2&envId=top-interview-150

var removeDuplicates = function(nums) {
    if (nums.length === 0){
        return 0;
    }

    let k = 1; // Initialize the count of unique elements to 1
    for (let i = 1; i < nums.length; i++){
        if (nums[i] !== nums[k-1]){
            nums[k] = nums[i];
            // Overwrite the next unique element
            k ++;
        }
    }
    return k;
};


