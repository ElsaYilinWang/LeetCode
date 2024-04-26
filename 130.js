// LeetCode 130 Surrounded Regions
// Refernece: https://leetcode.com/problems/surrounded-regions/?envType=featured-list&envId=top-interview-questions?envType=featured-list&envId=top-interview-questions

/**
 * @param {character[][]} board
 * @return {void} Do not return anything, modify board in-place instead.
 */
var solve = function(board) {
    if (board.length == 0) return null;

    for (var i = 0; i < board.length; i++){
        for(var j=0;j<board[0].length;j++){
            if(board[i][j] == 'O' && (i==0 || i==board.length-1 || j==0 || j==board[0].length-1)){
                  dfs(board,i,j)
               }
            }
    }

    for(var i = 0; i < board.length; i++){
        for(var j=0; j< board[0].length; j++){
            if(board[i][j]=='W'){
                board[i][j] = 'O';
            } else {
                board[i][j] = 'X';
            }
        }
    }
    return board;
};

function dfs(board, i, j){
    if(i<0 || j<0 || j>= board.length || j >= board[0].length || board[i][j]=='X' || board[i][j]=='W'){
        return;
    }
    board[i][j] = 'W'
    dfs(board, i+1, j)
    dfs(board, i-1, j)
    dfs(board, i, j+1)
    dfs(board, i, j-1)
}