// LeetCode 452 Minimum Number of Arrows to Burst Balloons
// Reference:https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/solutions/4890366/beat-93-80-full-explanation-with-pictures/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[][]} points
 * @return {number}
 */
var findMinArrowShots = function(points) {
    points.sort((a,b) => a[0] - b[0]);

    let arrows = 1;
    let end = points[0][1];

    for (let i = 1; i < points.length; i++){

        if (points[i][0] > end){
            arrows++;
            end = points[i][1];
        } else {
            end = Math.min(end, points[i][1]);
        }
    }
    return arrows;
};

