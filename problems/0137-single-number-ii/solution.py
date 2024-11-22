class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        count  = defaultdict(int)

        for num in nums:
            count[num] += 1

        for x,freq in count.items():
            if freq == 1:
                return x
        
        return -1
