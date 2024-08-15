



var smallestDistancePair = function (numbers, k) {
    numbers.sort((a, b) => a - b);
    let minDistance = 0;
    let maxDistance = numbers[numbers.length - 1] - numbers[0];

    while (minDistance < maxDistance) {
        let midDistance = Math.floor((minDistance + maxDistance) / 2);
        if (countPairsWithinDistance(numbers, midDistance) < k) {
            minDistance = midDistance + 1;
        } else {
            maxDistance = midDistance;
        }
    }

    return minDistance;
};





    
function countPairsWithinDistance(numbers, distance) {
    let count = 0;
    let left = 0;
    for (let right = 1; right < numbers.length; right++) {
        while (numbers[right] - numbers[left] > distance) {
            left++;
        }
        count += right - left;
    }
    return count;
} 





