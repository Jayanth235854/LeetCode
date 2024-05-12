class Solution:
    def reverseWords(self, s: str) -> str:
        w=s.split()
        rev=reversed(w)
        word=' '.join(rev)
        return word