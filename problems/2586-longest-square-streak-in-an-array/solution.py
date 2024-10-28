class Solution:
    def longestSquareStreak(self, nums: List[int]) -> int:
        mp = {}
        res = -1
        nums.sort()

        for num in nums:
            srt = isqrt(num)

            if srt*srt == num and srt in mp:
                mp[num] = mp[srt] + 1
                res = max(res,mp[num])
            else :
                mp[num] = 1
        
        return res
