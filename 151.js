// LeetCode 151 Reverse Words in a String
// Reference:

/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    // Trim the input string to remove leading and trailing spaces
    let i = 0, j = s.length - 1;
    
    // Find the first non-space character
    while (i <= j && s[i] === ' ') i++;

    // Find the last non-space character
    while (j >= i && s[j] === ' ') j--;

    // Extract the trimmed substring
    s = s.substring(i, j + 1);

    // Split the trimmed string into words based on spaces
    let words = s.split(/\s+/); // Tokenize the string into words

    // Initialize the output string
    let out = '';

    // Iterate through the words in reverse order
    for (let k = words.length - 1; k > 0; k--){
        // Append the current word and a space to the output
        out += words[k] + ' ';

    }
    // Append the first word to the output 
    // without trailing space
    out += words[0];

    return out; // Concatenate the reversed words
};

