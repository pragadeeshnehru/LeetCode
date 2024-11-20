class Solution:
    def smallestTrimmedNumbers(self, nums: List[str], queries: List[List[int]]) -> List[int]:
        answer = []
        
        for k, trim in queries:
            heap = []
            heapq.heapify(heap)
            for i in range(len(nums)):
                n1 = int(nums[i][-trim:])

                if len(heap) < k:
                    heapq.heappush(heap,[-n1,-i])
                
                elif n1 < -heap[0][0]:
                        heapq.heappop(heap)
                        heapq.heappush(heap, [-n1,-i])
            
            answer.append(-heapq.heappop(heap)[1])
        
        return answer

