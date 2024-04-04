// LeetCode 46 Permutations
// Reference: https://leetcode.com/problems/permutations/solutions/685868/dfs-backtracking-python-java-javascript-picture/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        dfs(new ArrayList<>(), new boolean[nums.length], res, nums);
        return res;
        
    }

    private static void dfs(List<Integer> path, boolean[] used, List<List<Integer>> res, int[] letters){
        if (path.size() == used.length){
            // make a deep copy since otherwise we'd be append the same list over and over
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for (int i = 0; i < used.length; i++){
            //skip used letters
            if (used[i]) continue;
            //add letter to permutation, mark letter as used
            path.add(letters[i]);
            used[i] = true;

            dfs(path, used, res, letters);
            // remove letter from permutation, mark letter as unused
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}