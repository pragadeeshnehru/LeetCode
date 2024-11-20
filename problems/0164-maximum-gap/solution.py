class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return 0

        # Sort the numbers in ascending order
        nums.sort()

        # Initialize maxDiff to 0
        maxDiff = 0

        # Find the maximum gap between consecutive elements in the sorted list
        for i in range(1, len(nums)):
            maxDiff = max(maxDiff, nums[i] - nums[i - 1])

        return maxDiff

