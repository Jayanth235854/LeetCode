class Solution(object):
    def isAcronym(self, words, s):
        a=""
        for i in words:
            a+=i[0]
        return a==s
        