// Leetcode 200 Number of Islands
// Reference: https://leetcode.com/problems/number-of-islands/solutions/429842/javascript-dfs-commented-thought-process-beats-100-time-and-space/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    let count = 0 // the counted islands
    // Go through each cell of the 2d array/grid
    for (let row = 0; row < grid.length; row++){
        for (let col = 0; col < grid[row].length; col++){
            if (grid[row][col] == '1'){
                count ++;
                explore(row, col, grid)
            }
        }
    }
    return count
    
};

// Takes a cell in a grid with a “1” , turns it into a “0” and explores (DFS) any of the left, right, up, down 1’s
function explore(row, col, grid){
    if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length || grid[row][col] === '0')
        return;
    grid[row][col] = '0'

    // Possibilities
    // to the right, left, top, bottom
    explore(row, col+1, grid)
    explore(row, col-1, grid)
    explore(row+1, col, grid)
    explore(row-1, col, grid)
}