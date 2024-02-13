class Solution(object):
    def firstPalindrome(self, words):
        for i in range(len(words)) :
            if words[i] == words[i][::-1]:
                return words[i]
        return ""
