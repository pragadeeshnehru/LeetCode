/**
 * @param {number[]} target
 * @param {number[]} arr
 * @return {boolean}
 */
var canBeEqual = function (target, arr) {
    if (target.length != arr.length) return false;

    const map = new Map();

    for (let i = 0; i < target.length; i++) {
        map.set(target[i], (map.get(target[i]) || 0) + 1);
        map.set(arr[i], (map.get(arr[i]) || 0) - 1);
    }

    for (let count of map.values()) {
        if (count !== 0) {
            return false;
        }
    }
    return true;
};
