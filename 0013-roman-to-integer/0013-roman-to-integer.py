class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        val={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        sum=val[s[-1]]
        for i in range(len(s)-2,-1,-1):
            if(val[s[i+1]]>val[s[i]]):
                sum=sum-val[s[i]]
            else:
                sum=sum+val[s[i]]
        return sum
        