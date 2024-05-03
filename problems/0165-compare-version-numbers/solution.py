class Solution(object):
    def compareVersion(self, version1, version2):
        i=0
        j=0
        n1 = len(version1)
        n2 = len(version2)
        while (i < n1 or j < n2 ):
            num1 = 0 
            num2 = 0 
            while (i < n1 and version1[i] != '.') :
                num1 = num1 * 10 + int(version1[i])
                i+=1

            while (j < n2 and version2[j] != '.') :
                num2 = num2 * 10 + int(version2[j])
                j+=1

            if num1 < num2: return -1
            if num1 > num2: return 1

            i+=1
            j+=1

        return 0
