/**
 * @param {string[]} arr
 * @param {number} k
 * @return {string}
 */
var kthDistinct = function (arr, k) {
    let ans = new Array();
    let i = 0;
    while (i < arr.length) {
        let flag = 1;
        for (let j = 0; j < arr.length; j++) {
            if (i != j && arr[i] === arr[j]) {
                flag = 0;
            }
        }
        if (flag != 0) { ans.push(arr[i]) };
        i++;
    }
    console.log(ans);

    return k<=ans.length ? ans[k - 1] : "";
};
