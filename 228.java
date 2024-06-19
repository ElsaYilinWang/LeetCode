// LeetCode 228 Summary Ranges
// Reference:https://leetcode.com/problems/summary-ranges/solutions/1805391/concise-solution-in-0-n-with-approach-explained-in-detail/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1])
                i++;
            
            if (start != nums[i]){
                al.add("" + start + "->" + nums[i]);
            } else {
                al.add("" + start);
            }
        }
        return al;
        
    }
}