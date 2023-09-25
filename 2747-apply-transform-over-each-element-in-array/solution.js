/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var myArr=[];
    for(let i=0;i<arr.length;i++){
        myArr[i] = fn(arr[i],i);
    }
    return myArr;
};
