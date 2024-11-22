class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        res=[]
        if not nums:
            return []

        start, end = nums[0], nums[0]
        for n in nums[1:]:
            if end + 1 == n:
                end=n
            else:
                if start==end:
                    res.append(str(start))    
                    start=end=n
                else:
                    res.append(str(start)+"->"+str(end))
                    start=end=n

        if start==end:
            res.append(str(start))    
        else:
            res.append(str(start)+"->"+str(end))
            start=end=n
        return res
