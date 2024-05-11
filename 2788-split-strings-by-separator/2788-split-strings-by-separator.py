class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        result=[]
        for word in words:
            splits=word.split(separator)
            for s in splits:
                if s:
                 result.append(s)
        return result