# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        start = 1
        end = n
        while start < end:
            mid = (start + end)>>1 # left shift by 1(2) similar to dividing by 2
            if isBadVersion(mid) == True:
                end = mid
            else: 
                start = mid + 1
        
        return start
                