from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        l, r = 0, sum(nums)
        for idx, num in enumerate(nums):
            r-=num
            if l==r:
                return idx
            l+=num
        return -1
        