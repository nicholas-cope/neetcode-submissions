class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # check frequency map of chars is equal
        # hashmap of s and t (char->count)
        # add chars in one iteration for each string
        # add check for edge case, if lengths are not the same -> invalid

        if len(s) != len(t):
            return False
        
        sMap, tMap = {}, {}
        for char in s:
            sMap[char] = sMap.get(char, 0) + 1
        for char in t:
            tMap[char] = tMap.get(char, 0) + 1
        
        return sMap == tMap