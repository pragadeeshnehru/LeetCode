class Solution:
    def minimumMountainRemovals(self, nums: List[int]) -> int:
        n = len(nums)
        LIS = [1] * n
        LDS = [1] * n

        for i in range(n):
            for j in range(i):
                if nums[i] > nums[j]:
                    LIS[i] = max(LIS[i],LIS[j] + 1)

        for i in range(n-1,-1,-1):
            for j in range(n-1,i,-1):
                if nums[i] > nums[j]:
                    LDS[i] = max(LDS[i],LDS[j] + 1)

        maxMountainLength = 0
        
        for i in range(1, n - 1):
            if LIS[i] > 1 and LDS[i] > 1:  # Valid peak
                maxMountainLength = max(maxMountainLength, LIS[i] + LDS[i] - 1)

        return n - maxMountainLength
        
