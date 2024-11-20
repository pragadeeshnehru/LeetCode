from typing import List

class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        negatives = [-num for num in nums if num < 0]
        positives = [num for num in nums if num >= 0]

        self.radixSort(negatives)
        self.radixSort(positives)

        negatives = [-num for num in reversed(negatives)]
        return negatives + positives

    def radixSort(self, nums: List[int]):
        if not nums:
            return

        maxNum = max(nums)
        exp = 1

        while maxNum // exp > 0:
            self.countsort(nums, exp)
            exp *= 10

    def countsort(self, nums: List[int], exp: int):
        n = len(nums)
        output = [0] * n
        count = [0] * 10

        for i in range(n):
            digit = (nums[i] // exp) % 10
            count[digit] += 1

        for i in range(1, 10):
            count[i] += count[i - 1]

        for i in range(n - 1, -1, -1):
            digit = (nums[i] // exp) % 10
            output[count[digit] - 1] = nums[i]
            count[digit] -= 1

        for i in range(n):
            nums[i] = output[i]

