// LeetCode 454 4Sum II
// Reference: https://leetcode.com/problems/4sum-ii/solutions/1740606/going-from-o-n-4-o-n-3-o-n-2-java-c/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.Map;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int k : nums3){
            for (int l : nums4){
                map.put(k+l, map.getOrDefault(k+l,0) + 1);
            }
        }
        int count = 0;

        for (int i : nums1){
            for (int j : nums2){
                count += map.getOrDefault(-(i+j), 0);
            }
        }
        return count;
    }
}