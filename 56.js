// leetcode 56 Merge Intervals
// Reference:https://leetcode.com/problems/merge-intervals/solutions/810795/python-js-go-c-by-sort-merge-w-visualization/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {

    // predefined constant for start (left endpoint), as well as end (right endpoint)
    const [START, END] = [0, 1];

    let result = [];

    // make all intervals sorted on (left endpoint, right endpoint) pair in ascending order
    intervals.sort( (a, b) => a[START] != b[START] ? a[START] - b[START] : a[END] - b[END] );
    
    for( const curInterval of intervals){
        
        if( (result.length == 0) || ( result[result.length-1][END] < curInterval[START]) ){
            // no overlapping
            result.push( curInterval );

        }else{
                // has overlapping
                // merge with previous interval
            result[result.length-1][END] = Math.max( result[result.length-1][END], curInterval[END] );
    
        }
    }
    return result;
};
