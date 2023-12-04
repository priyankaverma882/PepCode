from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for idx, num in enumerate(nums):
            k = target - num
            if k in seen:
                return [seen[k], idx]
            seen[num] = idx