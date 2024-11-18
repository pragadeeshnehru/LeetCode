class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        a = 1
        if k > 0:
            sec = code[:k]
            modified = code + sec
        else:
            a *= -1
            sec = code[k:]
            k *= -1
            modified = sec + code

        res = []
        sums = []
        for i in range(k):
            sums.append(modified[i])
        res.append(sum(sums))

        if not sums:
            return [0]*len(code)
        for i in range(k,len(modified)):
            # Pop first element add next element
            sums.pop(0) 
            sums.append(modified[i])
            if len(sums) == k:
                res.append(sum(sums))
        if a == 1:
            return res[1:]
        return res[:-1]
