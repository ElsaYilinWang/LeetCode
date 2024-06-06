// LeetCode 135 Candy
// Reference: https://leetcode.com/problems/candy/solutions/4037646/99-20-greedy-two-one-pass/?envType=study-plan-v2&envId=top-interview-150

//Time Complexity: O(n), because we make two passes through the array.
// Space Complexity: O(n), for storing the candies array.

import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++){
            if (ratings[i] > ratings[i - 1]){
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--){
            if (ratings[i] > ratings[i + 1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies){
            totalCandies += candy;
        }

        return totalCandies;
    }
}