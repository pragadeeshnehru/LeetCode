class Solution(object):

    def subsetsn(self,s):  
        if len(s) == 0:  
            return [[]]  
        x = self.subsetsn(s[:-1])  
        return x + [[s[-1]] + y for y in x]

    def subsetXORSum(self, s):
        subsets =  self.subsetsn(s)
        sum =0
        for subset in subsets:
            val = 0
            for num in subset:
                val = val ^ num
            sum += val 
        return sum

        
