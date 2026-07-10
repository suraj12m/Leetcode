class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        l=0
        h=len(s)-1

        while(l<=h):
            ls=s[l]
            hs=s[h]
            if(not ls.isalnum()):
                l+=1
                continue
            if(not hs.isalnum()):
                h-=1
                continue
            if(ls.lower() != hs.lower()):
               return False
            l+=1
            h-=1
        return True