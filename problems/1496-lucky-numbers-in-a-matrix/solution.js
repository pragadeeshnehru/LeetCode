/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var luckyNumbers  = function(matrix) {
    let rows= matrix.length;
    let cols= matrix[0].length;

    let row_min = new Array(rows).fill(Infinity);
    let col_max = new Array(cols).fill(0);
    
    for(let row=0;row<rows;row++){
        for(let col=0;col<cols;col++){
            let el = matrix[row][col];
            row_min[row] = Math.min(row_min[row], el);
            col_max[col] = Math.max(col_max[col], el);
        }
    }

    for(let row=0;row<rows;row++){
        for(let col=0;col<cols;col++){
            let el = matrix[row][col];
            if (el == row_min[row] && el == col_max[col]){
                return [el];
            }
        }
    }
    return []
};
