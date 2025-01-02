class Solution(object):
    def vowelStrings(self, words, queries):
        n = len(words)
        result = []
        prefix = [0] * (n+1)
        vowels = ['a','e','i','o','u']

        for i in range(n):
            prefix[i+1]  = prefix[i]
            if words[i][0] in vowels and words[i][-1] in vowels:
                prefix[i+1] += 1

        for start, end in queries:  
            result.append(prefix[end + 1] - prefix[start])


        return result 
