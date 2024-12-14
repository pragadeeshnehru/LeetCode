class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        while k:
            maxGift = max(gifts)
            gifts.remove(maxGift)
            floorGift = floor(sqrt(maxGift))
            gifts.append(floorGift)
            k-=1
        
        return sum(gifts)

