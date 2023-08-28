/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let start = 0;
    let end = nums.length;

    while(start < end){
        let mid = start + Math.floor((end- start)/2);
        if(nums[mid] == target){
            return mid;
        } else if(nums[mid]>target){
    // in increasingly sorted array if target is less then the mid index, 
    // there is a possibilty of it being inserted in mid index
            end = mid;
        } else { 
    // but when target is greater than the middle index ,there is no way for it to be exit in mid index 
            start = mid + 1;
        }   
    }
    return start;

};