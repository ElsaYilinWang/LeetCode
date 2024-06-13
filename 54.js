// LeetCode 54 Spiral Matrix
// Reference: https://leetcode.com/problems/spiral-matrix/solutions/3503965/beats-99-with-s-complexity/?envType=study-plan-v2&envId=top-interview-150

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {

    // MATRIX[Y][X]
    //    ---------
    //Y0 | 1  2  3 |
    //Y1 | 4  5  6 |
    //Y2 | 7  8  9 |
    //    ---------
    //     X0 X1 X2

    const yLength = matrix.length, xLength = matrix[0].length;
    let y=0, x=0, count=0, area= xLength * yLength, bag=[];

    while (count < area){
        for (let i = x; count < area && i < xLength - x; i++){

            bag.push(matrix[y][i])
            count++;
        }
        y++;

        for(let i=y; count<area && i<yLength-y+1; i++){
                
            bag.push(matrix[i][(xLength-1) - x])
            count++;
        }
        x++;
        for(let i= (xLength-1) - x; count<area && i>=x-1; i--)
            {
                bag.push(matrix[(yLength-1) - (y-1)][i])
                count++;
            }
    
            for(let i= (yLength-1) - y; count<area && i>=y; i--)
            {
                bag.push(matrix[i][x-1])
                count++;
            }


    }
    return bag
    
};