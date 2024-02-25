//LeetCode 217 Contains Duplicate
//Reference: https://leetcode.com/problems/contains-duplicate/solutions/3672475/4-method-s-c-java-python-beginner-friendly/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();

        for(int num: nums){
            if(seen.contains(seen)){
                return true;
            } else {
                seen.add(num);
            }
        }
        return false;

    }
}