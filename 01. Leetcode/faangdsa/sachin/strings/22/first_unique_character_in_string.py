from collections import Counter


class Solution:
    def firstUniqChar(self, s: str) -> int:
        counter = Counter(s)

        for idx, string in enumerate(s):
            if counter[string] == 1:
                return idx
        
        return -1
        