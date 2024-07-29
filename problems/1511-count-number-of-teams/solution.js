/**
 * @param {number[]} rating
 * @return {number}
 */
var numTeams = function (rating) {
    const n = rating.length;
    let count = 0;

    for (let j = 1; j < n - 1; j++) {
        var [left_smaller, left_larger, right_smaller, right_larger] = [0, 0, 0, 0];

        for(let i = 0; i < j; i++) {
            if (rating[i] < rating[j]) {
                left_smaller++;
            } else if (rating[i] > rating[j]) {
                left_larger++;
            }
        }

        for (let k = j + 1; k < n; k++) {
            if (rating[k] < rating[j]) {
                right_smaller++;
            } else if (rating[k] > rating[j]) {
                right_larger++;
            }
        }

        count += left_smaller * right_larger + left_larger * right_smaller;
    }
    return count;
};
