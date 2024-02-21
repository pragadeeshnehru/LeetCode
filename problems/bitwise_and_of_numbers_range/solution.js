/**
 * @param {number} left
 * @param {number} right
 * @return {number}
 */
var rangeBitwiseAnd = function(left, right) {
    let count=0
    while(left<right){
        left>>=1;
        right>>=1;
        count++;
    }

    return left<<count;
};