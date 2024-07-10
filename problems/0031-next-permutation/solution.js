/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    let brk=-1;
    let len = nums.length-1
    for(let i=len-1;i>=0;i--){
        if(nums[i]<nums[i+1]){
            brk = i;
            break;
        }
    }

    if (brk == -1) return nums.reverse();

    for (let i = len; i > brk; i--) {
        if (nums[i] > nums[brk]) {
            [nums[brk], nums[i]] = [nums[i], nums[brk]];
            break;
        }
    }

    let arr = nums.splice(brk+1, len).reverse()
    return nums.push(...arr)
}; 
