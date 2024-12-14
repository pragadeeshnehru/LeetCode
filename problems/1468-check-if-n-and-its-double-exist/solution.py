class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        i = 0

        while i < len(arr)-1:
            for j in range(i+1, len(arr)):
                if arr[i] == arr[j]*2 or arr[j] == arr[i]*2:
                    return True
            i+=1

        return False    
            
