class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        strs.sort()
        s=""
        for i in range(len(strs[0])):
            if(strs[0][i]==strs[-1][i]):
                s=s+strs[0][i]
            else:
                break
        return s
        