class Solution(object):
    def equalSubstring(self, s, t, maxCost):
        n = len(s)
        start = 0
        curr_cost = 0
        max_len = 0
        # ord represents unicode :: ASCII in this case
        for end in range(n):
            curr_cost += abs(ord(s[end]) - ord(t[end]))

            while curr_cost > maxCost:
                curr_cost -= abs(ord(s[start]) - ord(t[start]))
                start+=1
            
            max_len = max(max_len, end - start+1)
        
        return max_len
        
