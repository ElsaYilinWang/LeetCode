
// Leetcode 28 Find the Index of the First Occurrence in a String
// Reference:https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/solutions/590911/javascript-solution-no-built-in-methods/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {

    // the only mandatory check here is (needle === '')
    if (needle === '' || needle === haystack) return 0;
    // the other ones are for efficiency
    if (haystack.length < needle.length) return -1;

    // start looping through haystack until the remaining substring is shorter than needle
    for (let i = 0; i < haystack.length - needle.length + 1; i++){

        // as soon as we see a character that matches the first character of needle
        if (haystack[i] === needle[0]){

            // start looping through both needle and haystack
            for (let j = 0; j < needle.length; j++) { 

                // as soon as the characters don't match
                if (needle[j] !== haystack[i + j]) {

                    // break out of the loop and return to looping through haystack        
                    break;

                // otherwise, if we looped through the entire needle and all of the characters matched
                } else if (j === needle.length - 1){  
                    
                    // return the index of the first character of haystack with which we started the loop
                    return i;                                 
                }   
            }                                

        }

    }
    // return -1 if there wasn't a match
    return -1;   
};