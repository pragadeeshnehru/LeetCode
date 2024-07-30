/**
 * @param {string} s
 * @return {number}
 */
var minimumDeletions = function(s) {
    let deletions = 0, count =0;
    for(let ch of s) {
        if(ch === 'b'){
            count++;
        } else if (count > 0) {
            deletions += 1;
            count--;
        }
    }
    return deletions;
};
