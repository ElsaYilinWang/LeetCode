// LeetCode 49 Group Anagrams
// Reference:https://leetcode.com/problems/group-anagrams/solutions/19176/share-my-short-java-solution/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {return new ArrayList<>();}

        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);

            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}