//LeetCode 136 Single Number
// Reference: https://www.youtube.com/watch?v=KNOw_goVGas
 

class Solution {
    public int singleNumber(int[] nums) {

        //variable to store XOR value
        int sing = nums[0];

        //Loop for all elements
        for (int i = 0; i <nums.length; i++){

            //XOR the element with the previous result
            sing = sing ^ nums[i];
        }
        
        //return the result
        return sing;
    }
}